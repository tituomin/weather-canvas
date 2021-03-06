(ns weather-canvas.events
  (:require    [dommy.core :as dm]
               [cljs.core.async :as async
                :refer [chan put!]]))

(defn listen [el type]
  (let [c (chan)]
    (dm/listen!
     el type (fn [ev]
               (.preventDefault ev)
               (.stopPropagation ev)
               (put! c ev)))
    c))
