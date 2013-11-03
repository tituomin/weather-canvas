
(ns weather-canvas.core
  (:require
   [weather-canvas.templates :as templates]
   [weather-canvas.weather :as weather]
   [observation-data.observation-points :as obspoints]
   [dommy.utils :as utils]
   [goog.ui.ac :as autocomplete]
   [cljs.core.async :as async
    :refer [<! >! >!! chan close! sliding-buffer put! alts! timeout]]
   [dommy.core :as dm])
  (:use-macros
   [dommy.macros :only [node sel sel1]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(defn listen [el type]
  (let [c (chan)]
    (dm/listen!
     el type (fn [ev]
               (.preventDefault ev) (.stopPropagation ev)
               (put! c ev)))
    c))

(defn init-ui []
  (let [submit-form
        (sel1 (dm/append! (sel1 [:body :.form-wrapper]) (templates/query-form 1)) :form)

        submit-channel
        (listen submit-form :submit)

        years-channel
        (listen [submit-form :.year] :change)
        
        canvas
        (node [:canvas {:id "weather-canvas"}])
        ]
    (go (while true
          (let [ev (<! submit-channel)
                form-contents (handle-form (.-target ev))]
            (<! (timeout 100))
            (dm/append! (sel1 [:body :.canvas-wrapper]) canvas)
            (dm/remove-class! (sel1 [:body :.headers-top]) "hidden")
            (doseq)
            (weather/draw-async
             canvas
             (int (form-contents "year-start"))
             (int (form-contents "year-end"))
             (obspoints/name-to-id (form-contents "location"))
             (form-contents "quantity")
             (= "value" (form-contents "order"))))))

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
                  (drop-while #(<= (:end %1) end)
                              (sort-by :end subseq))]

              (init-location-autocomplete filtered))

            (<! (timeout 100)))))))

(defn indices [pred coll]
   (keep-indexed #(when (pred %2) %1) coll))

(defn init-location-autocomplete [points]
  (let [a (apply array (map :title points))]
    (dm/replace! (sel1 :#query-form-1-location) (node [:input {:id "query-form-1-location" :name "query-form-1-location" :autocomplete "off" :type "text"} ]))
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
