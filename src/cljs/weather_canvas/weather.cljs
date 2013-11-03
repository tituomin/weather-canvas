
(ns weather-canvas.weather
  (:require [fmi.metolib :as fmi]
            [dommy.core :as dm]
            [weather-canvas.gradient :as gradient]
            [cljs.core.async :as async
             :refer [<! >! >!! chan close! sliding-buffer put! alts! timeout]])
  (:use     [weather-canvas.canvas-buffer :only [init-canvas size-x size-y]]
            [weather-canvas.sheet :only [sheet gap group square]])
  (:use-macros
   [dommy.macros :only [node sel sel1]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(def api-key "9f1313c1-c123-40ad-9490-f25428b14bcf")

(def year-data      (atom {}))
(def years-to-fetch (atom 0))

(def main-group (atom nil))

(defn report-status [ready]
  (let [status-report (sel1 :#status-report)
        dispatch        #(if % dm/add-class! dm/remove-class!)
        man-ready       (dispatch ready)
        man-processing  (dispatch (not ready))]
    (man-processing  status-report "processing")
    (man-ready       status-report "ready")))

(defn leap-year [year]
  (or
   (= 0 (mod year 400))
   (and (not (= 0 (mod year 100)))
        (= 0 (mod year 4)))))
;; if year is divisible by 400 then
;;    is_leap_year
;; else if year is divisible by 100 then
;;    not_leap_year
;; else if year is divisible by 4 then
;;    is_leap_year
;; else
;;    not_leap_year)

(def c (chan))
(def c-msg (chan))

(go (while true
    (do
      (<! (timeout 5))
      (<! c-msg)
      (if (= @years-to-fetch 0)
        (do (report-status true) (close! c-msg))
        (report-status false)))))

(defn listen-results-async []
    (go
     (loop [parameters nil]
       (if (not (nil? parameters))
         (let [{:keys [data errors attribute offset context sorting year]} parameters
               preprocess (if sorting sort identity)
               days (preprocess (map #(.-value %)
                                     (-> data .-locations (nth 0)
                                         .-data (aget attribute)
                                         .-timeValuePairs)))
               jan-and-feb (+ 31 28)
               uniform-days (if (not (leap-year year))
                              (concat (conj (take jan-and-feb days)
                                            (get days (- jan-and-feb-days 1)))
                                      (drop jan-and-feb days))
                              days)]
           (if (leap-year year)
             (.log js/console (str "leap year " year)))
           (.log js/console (count days))
           (.log js/console (count uniform-days))
           (doseq [[x-coord temperature]
                   (map list (range) uniform-days)]
             (set! (.-fillStyle context)
                   (temperature-to-color temperature gradient/black-white-2))

             (.fillRect context 
                        (* size-x x-coord) (* size-y offset)
                        size-x             size-y))))
       (>! c-msg "done")
       (<! (timeout 10))
       (recur (<! c)))))

(defn listen-results-async-sheet []
    (go
     (loop [parameters nil]
       (if (not (nil? parameters))
         (let [{:keys [data errors attribute offset context sorting]} parameters
               preprocess (if sorting sort identity)]
           (swap! main-group assoc-in
                  [:content offset]
                  (group :right :interleave (gap 1)
                         :content
                         (for [temperature
                               (preprocess (map #(.-value %)
                                                (-> data
                                                    .-locations (nth 0)
                                                    .-data (aget attribute)
                                                    .-timeValuePairs)))]
                           (square 2 (temperature-to-color
                                      temperature
                                      gradient/black-white-2)))))))

       (>! c-msg "done")
       (<! (timeout 10))
       (recur (<! c)))))

(defn listen-results-async-fake []
    (go
     (loop [parameters nil]
       (if (not (nil? parameters))
         (let [{:keys [data errors attribute offset context sorting]} parameters
               preprocess (if sorting sort identity)]
           (.log js/console (-> data .-locations (nth 0) .-data))))
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
  (swap! years-to-fetch #(+ 1 (- to from)))
  (init-canvas canvas @years-to-fetch)
  (listen-results-async)
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
                               "end"   (make-date (str (+ 1 year)) "01" "01")
                               "callback" (fn [data, errors]
                                            (go
                                             (async/>! c {:data data :errors errors :attribute quantity :offset (- year from) :year year :context context :sorting sorting})
                                             (.disconnect connection))))]
          (if (.connect connection url stored-query-id)
            (.getData connection parameters)))))))

(defn draw-async-sheet [canvas from to quantity sorting]
  (let [years (+ 1 (- to from))]
    (.log js/console years)
    (reset! years-to-fetch years)
    (reset! main-group 
            (group :down :interleave (gap 1)
                   :content (apply vector (take years
                                  (repeat (square size-y "#666666"))))))
  
    (listen-results-async-sheet)
    (doseq [year (range from (+ 1 to))]
      (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
            stored-query-id "fmi::observations::weather::daily::multipointcoverage"
            url             (format "http://data.fmi.fi/fmi-apikey/%s/wfs" api-key)
            parameters      (js-obj
                             "fmisid" 100971 ; helsinki kaisaniemi
                             "requestParameter" "rrday,tday,snow,tmin,tmax"
                             "begin" (make-date (str year) "01" "01")
                             "end"   (make-date (str (+ 1 year)) "01" "01")
                             "callback" (fn [data, errors]
                                          (go
                                           (async/>! c {:data data :errors errors :attribute quantity :offset (- year from) :context nil :sorting sorting})
                                           (.disconnect connection))))]
        (if (.connect connection url stored-query-id)
          (.getData connection parameters))))))

