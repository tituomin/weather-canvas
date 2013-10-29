(ns weather-canvas.templates
  (:require [dommy.core])
  (:use-macros
    [dommy.macros :only [node deftemplate]]))

(def years (range 1950 (+ 1 (.getFullYear (js/Date.)))))

(defn query-form [sequence-no]
  (let 
      [id-prefix (format "query-form-%d" sequence-no)
       mk-id (fn [suffix] (format "%s-%s" id-prefix suffix))
       year-options (for [year years]
               [:option {:value year} year])]

    (node [:div {:class "query-form-container"}
           [:form {:id id-prefix}

            (group [
             (with-label "Vuodesta" :select (mk-id "year-start")
               year-options)
             (with-label "vuoteen" :select (mk-id "year-end")
               year-options)])

            (with-label "Paikka" :input (mk-id "location")
              nil)

            (group [[:input {:class "submit" :type "submit" :value "Näytä vuodet"}]])
            ]])))

(defn group [contents]
  [:div {:class "form-grouping"}
   (for [c contents] c)])

(defn with-label [label type id contents]
  [:span {:class "form-element"}
   [:label {:for id} label]
   [type {:id id :name id} contents]])

