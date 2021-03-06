
(ns weather-canvas.core
  (:require
   [weather-canvas.templates :as templates]
   [weather-canvas.weather :as weather]
   [observation-data.observation-points :as obspoints]
   [dommy.utils :as utils]
   [hipo.core :as hipo]
   [goog.ui.ac :as autocomplete]
   [goog.string :as gstring]
   [goog.string.format]
   [cljs.core.async :as async
    :refer [<! >! chan close! sliding-buffer put! alts! timeout]]
   [dommy.core :as dm :refer-macros [sel sel1]])
  (:use     [weather-canvas.canvas-buffer :only [init-canvas size-x size-y]]
            [weather-canvas.events :only [listen]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))


(def days-in-month
  [31
   29 ; note: non-leap years are modified for uniformity
   31
   30
   31
   30
   31
   31
   30
   31
   30
   31])

(defn init-ui []
  (let [el (templates/query-form 1)

        submit-form
        (sel1 (dm/append! (sel1 [:body :.form-wrapper]) el) :form)

        submit-channel
        (listen submit-form :submit)

        years-channel
        (listen [submit-form :.year] :change)]

    (go (while true
          (let [ev (<! submit-channel)
                form-contents (handle-form (.-target ev))
                year-start    (int (form-contents "year-start"))
                year-end      (int (form-contents "year-end"))
                canvas        (hipo/create [:canvas#weather-canvas])
                sort-by       (form-contents "order")
                top-headers   (sel1 [:body :.headers-top])]

            (<! (timeout 100))
            (dm/replace-contents! (sel1 [:body :.canvas-wrapper]) canvas)

            (doseq [[month width] (map list (sel top-headers :.month) days-in-month)]
              (dm/set-attr! month :style (gstring/format "width: %spx;" (- (* size-x width) 21))))

            (dm/toggle-class! top-headers "hidden" (= sort-by "value"))
            (let [headers-right (sel1 :.headers-right)]
              (dm/replace-contents! headers-right (hipo/create [:div]))
              (doseq [year (range year-start (+ 1 year-end))]
                (dm/append! headers-right (hipo/create [:div.year year]))))

            (weather/draw-async
             canvas
             year-start
             (if (< year-end year-start) year-start year-end)
             (obspoints/name-to-id (form-contents "location"))
             (form-contents "quantity")
             (= "value" sort-by)))))

    (go (while true
          (let [ev (<! years-channel)
                target (.-target ev)
                form-contents (handle-form submit-form)
                bound  (dm/attr target :data-bound)
                start  (int (form-contents "year-start"))
                end    (int (form-contents "year-end"))]

            (let [subseq
                  (take-while #(<= (:start %1) start)
                              (sort-by :start obspoints/metadata))

                  filtered
                  (drop-while #(< (:end %1) end)
                              (sort-by :end subseq))

                  old-location-name (.-value (sel1 :#query-form-1-location))
                  old-location (obspoints/name-to-record old-location-name)]

              (init-location-autocomplete filtered
                                          (if (and (<= (:start old-location) start)
                                                   (>= (:end old-location) end))
                                            old-location-name
                                            "")))
            (<! (timeout 100)))))))

(defn indices [pred coll]
   (keep-indexed #(when (pred %2) %1) coll))

(defn init-location-autocomplete [points default-value]
  (let [a (apply array (map :title points))]
    (dm/replace! (sel1 :#query-form-1-location) (hipo/create [:input {:id "query-form-1-location" :name "query-form-1-location" :autocomplete "off" :type "text" :value default-value} ]))
    (.createSimpleAutoComplete js/goog.ui.ac a (sel1 :#query-form-1-location) false)))

(defn handle-form [form]
  (let [id-prefix    (dm/attr form :id)
        strip-prefix (templates/id-stripper id-prefix)]
    (apply hash-map
           (flatten (for [el (sel form "input,select")
                          :let [id (dm/attr el :id)]
                          :when (not (nil? id))]
                      [(strip-prefix id) (dm/value el)])))))



(init-ui)
