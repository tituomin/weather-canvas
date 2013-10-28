
(ns weather-canvas.weather
  (:require [fmi.metolib :as fmi]
            [goog.dom :as dom]
            [cljs.core.async :as async
             :refer [<! >! >!! chan close! sliding-buffer put! alts! timeout]])
            (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(def year-data      (atom {}))
(def years-to-fetch (atom 0))

(defn report-status [message]
  (.setTextContent js/goog.dom (.getElement js/goog.dom "status-report") message))


(def c (chan))
(def c-msg (chan))

(go (while true
    (do
      (<! c-msg)
      (<! (timeout 10))
      (if (= @years-to-fetch 0)
        (do (report-status "Finished.") (close! c-msg))
        (report-status (str "Drawing, "(swap! years-to-fetch - 1) " to go "))))))

(defn listen-results-async []
  (let [size-x 4
        size-y 16]
    (go
     (loop [parameters nil]
       (if (not (nil? parameters))
         (let [[data errors attribute offset context] ((juxt :data :errors :attribute :offset :context) parameters)]
           (doseq [[x-coord temperature]
                   (map list
                      (range)
                      (map #(.-value %)
                           (-> data
                               .-locations
                               (nth 0)
                               .-data
                               (aget attribute)
                               .-timeValuePairs)))]
             (set! (.-fillStyle context)
                 (temperature-to-color temperature gradient-black-white-2))

           (.fillRect context 
                      (* size-x x-coord) (* size-y offset)
                      size-x             size-y)))
         )
       (<! (timeout 10))
       (>! c-msg "jei")
       (recur (<! c))))))


(defn draw-results [data errors attribute offset context]
  (let [size-x 4 size-y 16]
    (doseq [[x-coord temperature]
            (map list
                 (range)
                 (map #(.-value %)
                      (-> data
                          .-locations
                          (nth 0)
                          .-data
                          (aget attribute)
                          .-timeValuePairs)))]
      
      (set! (.-fillStyle context)
            (temperature-to-color temperature gradient-black-white-2))

      (.fillRect context 
                 (* size-x x-coord) (* size-y offset)
                    size-x             size-y))))


(defn store-results [year data errors attribute]
  (swap! year-data assoc year 
         (map #(temperature-to-color % gradient-black-white-2)
              (sort
               (map #(.-value %) (-> data
                  .-locations
                  (nth 0)
                  .-data
                  (aget attribute)
                  .-timeValuePairs)))))
  (report-status (str (- @years-to-fetch 1) " to go, got year " year ))
  (if (= (swap! years-to-fetch - 1) 0)
    (try (draw-stored-results @year-data) (catch js/Object e (str "Caught: " e)))))

(defn store-results-by-color [year data errors attribute]
  (doseq [[time color]
          (map (juxt #(.-time %) #(temperature-to-color (.-value %) gradient-black-white))
               (-> data .-locations first .-data (aget attribute) .-timeValuePairs))]
    (swap! year-data update-in [color] #(conj %1 %2))))

(defn draw-stored-results [stored-results]
  (let [canvas-buffer (init-canvas (.createElement js/document "canvas"))
        context (.getContext canvas-buffer "2d")
        size-x 4 size-y 16
        first-year (apply min (keys stored-results))]

    (doseq [[year data] (sort-by key stored-results)]
     (doseq [[x-grid color] (map list (iterate inc 0) data)]
       (set! (.-fillStyle context) color)
       (.fillRect context
                  (* size-x x-grid)
                  (* size-y (- year first-year))
                  size-x
                  size-y)))
   (let [canvas (.getElementById js/document "weather-canvas")
         context (.getContext canvas "2d")]
     (.drawImage context canvas-buffer 0 0))
   (report-status "Done.")))

(defn draw-store-results-by-color [stored-results]
  (let [canvas-buffer (init-canvas (.createElement js/document "canvas"))
        context (.getContext canvas-buffer "2d")
        size-x 4 size-y 16
        first-year (apply min (keys stored-results))]

    (doseq [[year data] (sort-by key stored-results)]
     (doseq [[x-grid color] (map list (iterate inc 0) data)]
       (set! (.-fillStyle context) color)
       (.fillRect context
                  (* size-x x-grid)
                  (* size-y (- year first-year))
                  size-x
                  size-y)))
   (let [canvas (.getElementById js/document "weather-canvas")
         context (.getContext canvas "2d")]
     (.drawImage context canvas-buffer 0 0))
   (report-status "Done.")))



(def gradient-a
  {:direction :up
   :colors
   [{:range [0    500]
     :from  '(0x00 0x00 0x00)
     :to    '(0x3a 0x00 0x00)}

   {:range  [500  750]
     :from  '(0x00 0x3a 0x00)
     :to    '(0x3a 0x3a 0x00)}

    {:range [750 1000]
     :from  '(0x3a 0x3a 0x00)
     :to    '(0xff 0xff 0xff)}]})

(def gradient-black-white-2
  {:direction :up
   :colors
   [
    {:range [-100    -50]
     :from  '(0xff 0xff 0xff)
     :to    '(0xff 0xff 0xff)}

    {:range [-50    0]
     :from  '(0x00 0x00 0xff)
     :to    '(0xff 0xff 0xff)}

    {:range [0    15]
     :from  '(0xff 0xff 0xff)
     :to    '(0xff 0xff 0x66)}
    
    {:range [15    30]
     :from  '(0xff 0xff 0x66)
     :to    '(0xff 0x00 0x00)}
    ]}
)


(def gradient-black-white
  {:direction :up
   :colors
   [
    {:range [-100    -50]
     :from  '(0xff 0xff 0xff)
     :to    '(0xff 0xff 0xff)}

    {:range [-50    0]
     :from  '(0xff 0xff 0xff)
     :to    '(0x88 0x88 0xff)}

    {:range [0    15]
     :from  '(0xff 0xff 0xff)
     :to    '(0xff 0xff 0x66)}
    
    {:range [15    30]
     :from  '(0xff 0xff 0x66)
     :to    '(0xff 0x00 0x00)}
    ]}
)

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

(defn test []
  (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
        stored-query-id "fmi::observations::weather::multipointcoverage"
        url             "http://data.fmi.fi/fmi-apikey/9f1313c1-c123-40ad-9490-f25428b14bcf/wfs"
        today           1380712103000
        previous        (- today (* 2 24 60 60 1000))
        parameters      (js-obj
                         "sites" "Helsinki"
                         "requestParameter" "temperature"
                         "begin" (js/Date. 1368172800000)
                         "end"   (js/Date. 1368352800000)
                         "timestep" (* 60 60 1000)
                         "callback" (fn [data, errors]
                                      (draw-results data errors "temperature" 0 nil)
                                      (.disconnect connection)))]
    (if (.connect connection url stored-query-id)
      (.getData connection parameters))))

(defn make-date [year month day]
  (let [date (js/Date. (str year "-" month "-" day))]
    (js/Date. (.valueOf date))))


(defn test-2 []
  (let [canvas  (.getElementById js/document "weather-canvas")
        context (.getContext canvas "2d")]

    (doseq [year (range 1980 2013)]
      (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
            stored-query-id "fmi::observations::weather::daily::multipointcoverage"
            url             "http://data.fmi.fi/fmi-apikey/9f1313c1-c123-40ad-9490-f25428b14bcf/wfs"
            attribute       "tday"
            parameters      (js-obj
                             "fmisid" 100971 ; helsinki kaisaniemi
                             "requestParameter" attribute
                             "begin" (make-date (str year) "01" "01")
                             "end"   (make-date (str (+ 1 year)) "01" "01")
                             "callback" (fn [data, errors]
                                          (draw-results data errors attribute (- year 1980) context)
                                          (.disconnect connection)))]

        (if (.connect connection url stored-query-id)
          (.getData connection parameters))))))

(defn test-2-async []
  (swap! years-to-fetch #(- 2013 1980))
  (listen-results-async)
  (let [canvas  (.getElementById js/document "weather-canvas")
        context (.getContext canvas "2d")]

     (doseq [year (range 1980 2013)]
       (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
             stored-query-id "fmi::observations::weather::daily::multipointcoverage"
             url             "http://data.fmi.fi/fmi-apikey/9f1313c1-c123-40ad-9490-f25428b14bcf/wfs"
             attribute       "tday"
             parameters      (js-obj
                              "fmisid" 100971 ; helsinki kaisaniemi
                              "requestParameter" attribute
                              "begin" (make-date (str year) "01" "01")
                              "end"   (make-date (str (+ 1 year)) "01" "01")
                              "callback" (fn [data, errors]
                                           (go
                                            (async/>! c {:data data :errors errors :attribute attribute :offset (- year 1980) :context context})
                                            (.disconnect connection)
                                            )



                                           ))]

         (if (.connect connection url stored-query-id)
           (.getData connection parameters))))
     )
    )


(defn test-3 []
    (swap! years-to-fetch #(- 2013 1980))
    (doseq [year (range 1980 2013)]
      (let [connection      (js/fi.fmi.metoclient.metolib.WfsConnection.)
            stored-query-id "fmi::observations::weather::daily::multipointcoverage"
            url             "http://data.fmi.fi/fmi-apikey/9f1313c1-c123-40ad-9490-f25428b14bcf/wfs"
            attribute       "tmin"
            parameters      (js-obj
                             "fmisid" 100971 ; helsinki kaisaniemi
                             "requestParameter" attribute
                             "begin" (make-date (str year) "01" "01")
                             "end"   (make-date (str (+ 1 year)) "01" "01")
                             "callback" (fn [data, errors]
                                          (store-results year data errors attribute)
                                          (.disconnect connection)))]

        (if (.connect connection url stored-query-id)
          (.getData connection parameters)))))


(defn init-canvas [canvas]
    (set! (.-width canvas)  (- (.-innerWidth js/window) 50))
    (set! (.-height canvas) (- (.-innerHeight js/window) 50))
    canvas)

(init-canvas (.getElementById js/document "weather-canvas"))
;(test-2-async)
