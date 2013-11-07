
(ns weather-canvas.weather
  (:require [fmi.metolib :as fmi]
            [dommy.core :as dm]
            [weather-canvas.gradient :as gradient]
            [cljs.core.async :as async
             :refer [<! >! >!! chan close! sliding-buffer put! alts! timeout]])
  (:use     [weather-canvas.events :only [listen]]
            [weather-canvas.canvas-buffer :only [init-canvas size-x size-y]]
            [weather-canvas.sheet :only [sheet gap group square]])
  (:use-macros
   [dommy.macros :only [node sel sel1]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(def api-key "9f1313c1-c123-40ad-9490-f25428b14bcf")

(def year-data      (atom []))
(def years-to-fetch (atom 0))

(def main-group (atom nil))

(defn value-at-point [x y]
  (let [i (int (/ (max 0 x) size-x))
        j (int (/ (max 0 y) size-y))
        d (get (get @year-data j) i)]
    (if d (node [:div {:id "data"}
                 [:div {:class "weekday"} (:weekday d)]
                 [:div {:class "day"} (str (:day d) ".")]
                 [:div {:class "month"} (str (:month d) ".")]
                 [:div {:class "year"} (:year d)]
                 [:div {:class "description"} (:description d)]
                 [:div {:class "value"} (:value d)]
                 [:div {:class "unit"} (:unit d)]])
        (node [:div {:id "data"}]))))

(defn init-cursor-listener! [canvas]
  (let [cc (listen canvas :mousemove)]
    (go (while true
          (let [e (<! cc)
                target (.-target e)
                x (- (.-pageX e) (.-offsetLeft target))
                y (- (.-pageY e) (.-offsetTop target))]
            (dm/replace! (sel1 :#data) (value-at-point x y)))))))

(defn report-status [ready]
  (let [status-report (sel1 :#status-report)]
    (if ready
      (do
        (dm/remove-class! status-report "processing")
        (dm/add-class! status-report "ready")
        (init-cursor-listener! (sel1 :#weather-canvas))
        (reset! years-to-fetch 0)))))

(defn leap-year? [year]
  (or
   (= 0 (mod year 400))
   (and (not (= 0 (mod year 100)))
        (= 0 (mod year 4)))))

(def c (chan))
(def c-msg (chan))

(go (while true
    (do
      (<! (timeout 10))
      (if (<! c-msg)
        (report-status (< @years-to-fetch 0))))))

(defn filled [data expected predicate filler]
  (if (empty? expected)
    []
    (if (= (count data) (count expected))
      data
      (if (predicate (first data) (first expected))
        (cons (first data) (lazy-seq (filled (rest data) (rest expected) predicate filler)))
        (cons (filler (first expected)) (lazy-seq (filled data (rest expected) predicate filler)))))))

(def weekday ["su" "ma" "ti" "ke" "to" "pe" "la"])
(def scale {"tday" "C" "tmax" "C" "tmin" "C" "rrday" "mm" "snow" "cm"})
(def description {"tday" "keskilämpötila" "tmax" "maksimilämpötila" "tmin" "minimilämpötila" "rrday" "sademäärä" "snow" "lumensyvyys"})
(def grad {"tday" gradient/temperature
               "tmax" gradient/temperature
               "tmin" gradient/temperature
               "rrday" gradient/rain
               "snow" gradient/snow})

(defn listen-results-async []
    (go
     (loop [parameters nil]
       (swap! years-to-fetch #(- % 1))
       (if (and (not (nil? parameters)) (not (nil? (-> (:data parameters) .-locations (nth 0)))))
         (let [{:keys [data errors attribute offset context sorting year]} parameters
               preprocess (if sorting sort identity)
               preprocess-data (if sorting #(sort-by :value %) identity)
               first-date (.getTime (js/Date. (str year "-01-01T00:00:00Z")))
               data-seq 
               (filled 
                (-> data .-locations (nth 0) .-data
                    (aget attribute) .-timeValuePairs)
                (map #(+ first-date (* % 1000 60 60 24)) (range 0 (if (leap-year? year) 366 365)))
                (fn [got exp] (and
                               (not (nil? got))
                               (= (.-time got) exp)))
                (fn [d]
                  (let [obj (js/Object.)]
                    (set! (.-time obj) d)
                    (set! (.-value obj) :missing)
                    obj)))

               jan-and-feb (+ 31 28)
               uniform-data-seq (if (not (leap-year? year))
                              (concat (concat (take jan-and-feb data-seq)
                                              [(nth data-seq (- jan-and-feb 1))])
                                      (drop jan-and-feb data-seq))
                              data-seq)

               uniform-days (preprocess (map #(.-value %) uniform-data-seq))]
           (swap! year-data #(assoc % offset
                                    (apply vector (preprocess-data (for [el uniform-data-seq]
                                                    (let [date (js/Date. (.-time el))
                                                          value (if (js/isNaN (.-value el))
                                                                  :missing (.-value el))]
                                                      {:day (.getDate date)
                                                       :weekday (weekday (.getDay date))
                                                       :month (+ 1 (.getMonth date))
                                                       :year (.getFullYear date)
                                                       :unit (if (= :missing value) "" (scale attribute))
                                                       :description (description attribute)
                                                       :value (if (= :missing value) "mittaus puuttuu" value)}))))))

           (doseq [[x-coord temperature]
                   (map list (range) uniform-days)]

             (if (not (or (= :missing temperature) (js/isNaN temperature)))
               (do (set! (.-fillStyle context)
                         (temperature-to-color temperature (grad attribute)))
                   (.fillRect context 
                              (* size-x x-coord) (* size-y offset)
                              size-x             size-y))))))

       (>! c-msg "done")
       (<! (timeout 10))
       (recur (<! c)))
     (>! c-msg "done")))

;; (defn listen-results-async-sheet []
;;     (go
;;      (loop [parameters nil]
;;        (if (not (nil? parameters))
;;          (let [{:keys [data errors attribute offset context sorting]} parameters
;;                preprocess (if sorting sort identity)]
;;            (swap! main-group assoc-in
;;                   [:content offset]
;;                   (group :right :interleave (gap 1)
;;                          :content
;;                          (for [temperature
;;                                (preprocess (map #(.-value %)
;;                                                 (-> data
;;                                                     .-locations (nth 0)
;;                                                     .-data (aget attribute)
;;                                                     .-timeValuePairs)))]
;;                            (square 2 (temperature-to-color
;;                                       temperature
;;                                       gradient/black-white-2)))))))

;;        (>! c-msg "done")
;;        (<! (timeout 10))
;;        (recur (<! c)))))

(defn listen-results-async-fake []
    (go
     (loop [parameters nil]
       (if (not (nil? parameters))
         (let [{:keys [data errors attribute offset context sorting]} parameters
               preprocess (if sorting sort identity)]
))
       (<! (timeout 20))
       (>! c-msg "done")
       (recur (<! c)))))

(defn in-range [point segment]
  (let [range (:range segment)]
    (and (>= point (first range))
         (<= point (second range)))))


;3688 ms without memoization
;2328 ms memoized
(defn color-string [rgb-seq]
  (apply str
         (concat "#"
                 (map #(-> % int (.toString 16) (pad-with "0" 2))
                      rgb-seq))))

(def memo-color-string (memoize color-string))

(defn pad-with [string char width]
  (apply str (reverse (take width (concat (reverse string) (repeat char))))))

(defn temperature-to-color [point gradient]
  (let [segment        (first (filter (partial in-range point)
                                      (:colors gradient)))
        color-from     (:from segment)
        color-to       (:to   segment)
        range          (:range segment)
        range-start    (first  range)
        range-end      (second range)
        point-in-range (/ (- point range-start) (- range-end range-start))]
        (memo-color-string
         (map + color-from
              (map #(* point-in-range %)
                   (map - color-to color-from))))))

(defn today-minus [days]
  (let [d (js/Date.)]
    (.setDate d (- (.getDate d) days))
    (.getTime d)))


(defn make-date [year month day]
  (let [date (js/Date. (str year "-" month "-" day))]
    (js/Date. (.valueOf date))))


(defn draw-async [canvas from to location-id quantity sorting]
  (reset! years-to-fetch (+ 1 (- to from)))
  (init-canvas canvas @years-to-fetch)
  (reset! year-data (apply vector (repeat @years-to-fetch [])))
  (listen-results-async)
  (dm/add-class! (sel1 :#status-report) "processing")

  (if location-id
    (let [context (.getContext canvas "2d")]
      (doseq [year (range from (+ 1 to))]
        (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
              stored-query-id "fmi::observations::weather::daily::multipointcoverage"
              url             (format "http://data.fmi.fi/fmi-apikey/%s/wfs" api-key)
              parameters      (js-obj
                               "fmisid" location-id ; helsinki kaisaniemi
                               "requestParameter" "rrday,tday,snow,tmin,tmax"
                               "begin" (make-date (str year) "01" "01")
                               "end"   (make-date (str year) "12" "31")
                               "callback" (fn [data, errors]
                                            (if data
                                              (go
                                               (async/>! c {:data data :errors errors :attribute quantity :offset (- year from) :year year :context context :sorting sorting})
                                             (.disconnect connection))                                              )
))]
          (if (.connect connection url stored-query-id)
            (.getData connection parameters)))))))

;; (defn draw-async-sheet [canvas from to quantity sorting]
;;   (let [years (+ 1 (- to from))]
;;     (.log js/console years)
;;     (reset! years-to-fetch years)
;;     (reset! main-group 
;;             (group :down :interleave (gap 1)
;;                    :content (apply vector (take years
;;                                   (repeat (square size-y "#666666"))))))
  
;;     (listen-results-async-sheet)
;;     (doseq [year (range from (+ 1 to))]
;;       (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
;;             stored-query-id "fmi::observations::weather::daily::multipointcoverage"
;;             url             (format "http://data.fmi.fi/fmi-apikey/%s/wfs" api-key)
;;             parameters      (js-obj
;;                              "fmisid" 100971 ; helsinki kaisaniemi
;;                              "requestParameter" "rrday,tday,snow,tmin,tmax"
;;                              "begin" (make-date (str year) "01" "01")
;;                              "end"   (make-date (str year) "12" "31")
;;                              "callback" (fn [data, errors]
;;                                           (go
;;                                            (async/>! c {:data data :errors errors :attribute quantity :offset (- year from) :context nil :sorting sorting})
;;                                            (.disconnect connection))))]
;;         (if (.connect connection url stored-query-id)
;;           (.getData connection parameters))))))

