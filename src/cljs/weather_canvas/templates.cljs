(ns weather-canvas.templates
  (:require [hipo.core :as hipo]
            [goog.string :as gstring]
            [goog.string.format]))

(def years (reverse (range 1959 (+ 1 (.getFullYear (js/Date.))))))

(defn id-generator [prefix]
  (fn [suffix] (gstring/format "%s-%s" prefix suffix)))
(defn id-stripper [prefix]
  (fn [id] (second (clojure.string/split id (str prefix "-")))))

(defn query-form [sequence-no]
  (let 
      [id-prefix (gstring/format "query-form-%d" sequence-no)
       mk-id     (id-generator id-prefix)
       year-options-2 (for [year years]
                        (if (= (.getFullYear (js/Date.)) year)
                          [:option {:value year :selected "selected"} year]
                          [:option {:value year} year]))
       year-options-1 (for [year years]
                        [:option {:value year} year])]
    (hipo/create [:div.query-form-container
                  [:form {:id id-prefix :autocomplete "off"}
                   [:div.form-grouping
                    (with-label "vuodesta" :select (mk-id "year-start")
                      (conj year-options-1 [:option {:value -1 :selected "selected"} "valitse"])
                      {:class "year" :data-bound "start"})
                    (with-label "vuoteen" :select (mk-id "year-end") year-options-2 {:class "year" :data-bound "end"})
                    (with-label "paikassa" :input (mk-id "location")
                      nil {:autocomplete "off" :type "text" :disabled "disabled"})]

                   [:div.form-grouping 
                    (with-label "piirrä" :select (mk-id "quantity")
                      [[:option {:value "tday"} "keskilämpötila"]
                       [:option {:value "tmax"} "maksimilämpötila"]
                       [:option {:value "tmin"} "minimilämpötila"]
                       [:option {:value "rrday"} "sademäärä"]
                       [:option {:value "snow"} "lumensyvyys"]
                       ])
                    (with-label "järjestä" :select (mk-id "order")
                      [[:option {:value "default"} "ajan mukaan"]
                       [:option {:value "value"} "mittausarvon mukaan"]] c)

                    [:input {:class "submit" :type "submit" :value "Toteuta!"}]]]])))


(defn with-label [label type id contents & attrs]
  [:span {:class "form-element"}
   [:label {:for id} label]
   (into [type (merge {:id id :name id} (first attrs))] contents)])

