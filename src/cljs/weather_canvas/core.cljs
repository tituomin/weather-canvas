
(ns weather-canvas.core
  (:require
   [weather-canvas.templates :as templates]
   [weather-canvas.weather :as weather]
   [dommy.utils :as utils]
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



(let [submit-form
      (dm/append! (sel1 :body) (templates/query-form 1))

      submit-channel
      (listen submit-form :submit)

      canvas
      (node [:canvas {:id "weather-canvas"}])
      ]
  (go (while true
        (let [ev (<! submit-channel)
              form-contents (handle-form (.-target ev))]
          (<! (timeout 100))
          (dm/append! (sel1 :body) canvas)
          (weather/test-2-async canvas (int (form-contents "year-start")) (int (form-contents "year-end")))))))

(defn handle-form [form]
  (let [id-prefix    (dm/attr form :id)
        strip-prefix (templates/id-stripper id-prefix)]
    (apply hash-map
           (flatten (for [el (sel form "input,select")
                          :let [id (dm/attr el :id)]
                          :when (not (nil? id))]
                      [(strip-prefix id) (dm/value el)])))))

