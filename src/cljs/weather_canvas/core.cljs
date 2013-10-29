
(ns weather-canvas.core
  (:require
   [weather-canvas.templates :as templates]
   [dommy.utils :as utils]
   [cljs.core.async :as async
    :refer [<! >! >!! chan close! sliding-buffer put! alts! timeout]]
   [dommy.core :as dm])
  (:use-macros
    [dommy.macros :only [node sel sel1]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(defn listen [el type]
  (let [c (chan)]
    (dm/listen! el type #(put! c %))
    c))

(let [submit-input
      (sel1 (dm/append! (sel1 :body) (templates/query-form 1)) :.submit)
      submit-channel
      (listen submit-input :submit)]
  (go (while true
        (let [ev (<! submit-channel)]
          (.log js/console ev)
          )))
;  (.log js/console submit-input)
;  (dm/append! (sel1 :body) (node submit-input))
)

