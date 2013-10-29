
(ns weather-canvas.templates
  (:require [dommy.core])
  (:use-macros
    [dommy.macros :only [node deftemplate]]))

(def years (range 1950 (+ 1 (.getFullYear (js/Date.)))))

(defn query-form [sequence-no]
  (let 
      [id-prefix (format "query-form-%d" sequence-no)
       mk-id (fn [suffix] (format "%s-%s" id-prefix suffix))]

    (node [:div {:class "query-form-container"}
           [:form {:id id-prefix}

            [:label {:for (mk-id "year-start")} "Ensimmäinen vuosi"]
            [:select {:id (mk-id "year-start") :name (mk-id "year-start")}
             (for [year years]
               [:option {:value year} year])]

            [:label {:for (mk-id "year-end")} "Viimeinen vuosi"]
            [:select {:id (mk-id "year-end") :name (mk-id "year-end")}
             (for [year years]
               [:option {:value year} year])]

;            [:label {:for "location"} (mk-id "Paikka") nil]
;            [:input {:type "text ":id (mk-id "location")}]
            (with-label :input (mk-id "location") "Paikka" nil)

            [:input {:type "submit" :value "Piirrä vuodet"}]]])))

(defn with-label [type id label contents]
  [:label {:for id} label]
  [type {:id id :name id} contents]
  )
