
(ns weather-canvas.core
  (:require
   [weather-canvas.templates :as templates]
   [dommy.utils :as utils]
   [dommy.core :as dm])
  (:use-macros
    [dommy.macros :only [node sel sel1]]))


(dm/append! (sel1 :body) (templates/query-form 1))
