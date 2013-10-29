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

            [:span {:class "form-element"}
            [:select {:id (mk-id "focus")}
             [:option {:value "summer"} "Kesät"]
             [:option {:value "winter"} "Talvet"]]]

            (with-label "vuodesta" :select (mk-id "year-start")
              year-options)
            (with-label "vuoteen" :select (mk-id "year-end")
              year-options)
            (with-label "paikassa" :input (mk-id "location")
              nil)
            [:input {:class "submit" :type "submit" :value "Piirrä"}]
            ]])))

(defn group [contents]
  [:div {:class "form-grouping"}
   (for [c contents] c)])

(defn with-label [label type id contents]
  [:span {:class "form-element"}
   [:label {:for id} label]
   [type {:id id :name id} contents]])

