
(ns weather-canvas.sheet
  (:require [weather-canvas.gradient :as gradients]))

(defn make-sheet
  ([size-x size-y gradient]
     {:size-x size-x
      :size-y size-y
      :gradient gradient})
  ([] (make-sheet 4 16 gradients/black-white-2)))

;(.-innerWidth js/window)
