(ns weather-canvas.templates
  (:require [dommy.core])
  (:use-macros
    [dommy.macros :only [node deftemplate]]))

(def years (reverse (range 1950 (+ 1 (.getFullYear (js/Date.))))))

(defn id-generator [prefix]
  (fn [suffix] (format "%s-%s" prefix suffix)))
(defn id-stripper [prefix]
  (fn [id] (second (clojure.string/split id (str prefix "-")))))

(defn query-form [sequence-no]
  (let 
      [id-prefix (format "query-form-%d" sequence-no)
       mk-id     (id-generator id-prefix)
       year-options (for [year years]
               [:option {:value year} year])]

    (node [:div {:class "query-form-container"}
           [:form {:id id-prefix}

;            [:span {:class "form-element"}
;            [:select {:id (mk-id "focus")}
;             [:option {:value "summer"} "Kesät"]
;             [:option {:value "winter"} "Talvet"]]]


            (group [

            (with-label "vuodesta" :select (mk-id "year-start")
              year-options)
            (with-label "vuoteen" :select (mk-id "year-end")
              year-options)
            (with-label "paikassa" :input (mk-id "location")
              nil)
                    ])

            (group [

                    (with-label "piirrä" :select (mk-id "quantity")
                      (for [c [[:option {:value "tday"} "keskilämpötila"]
                               [:option {:value "tmax"} "maksimilämpötila"]
                               [:option {:value "tmin"} "minimilämpötila"]
                               [:option {:value "rrday"} "sademäärä"]
                               [:option {:value "snow"} "lumensyvyys"]
                               ]] c))

                    (with-label "järjestä" :select (mk-id "order")
                      (for [c [[:option {:value "default"} "ajan mukaan"]
                               [:option {:value "value"} "lämpötilan mukaan"]]] c))

                    [:input {:class "submit" :type "submit" :value "Toteuta!"}]

            ])]])))



(defn group [contents]
  [:div {:class "form-grouping"}
   (for [c contents] c)])

(defn with-label [label type id contents]
  [:span {:class "form-element"}
   [:label {:for id} label]
   [type {:id id :name id} contents]])

