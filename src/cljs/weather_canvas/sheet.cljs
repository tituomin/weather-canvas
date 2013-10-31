

(ns weather-canvas.sheet
  (:require [weather-canvas.gradient :as gradients]))

(defn sheet
  ([size-x size-y gradient]
     {:size-x size-x
      :size-y size-y
      :gradient gradient})
  ([] (make-sheet 4 16 gradients/black-white-2)))

;(.-innerWidth js/window)

(defn test-sheet []
  (let [sheet-1 (sheet
                 [(layer "foreground"
                         [(group :down (gap 2)
                                 [(group :right :interleave (gap 1)
                                         [(repeat 31 (square 2 0xFFFFFF))
                                          (repeat 30 (square 2 0xFFFFFF))
                                          (repeat 29 (square 2 0xFFFFFF))])
                                  (group :right :interleave (gap 1)
                                         [(repeat 31 (square 2 0xFFFFFF))
                                          (repeat 30 (square 2 0xFFFFFF))
                                          (repeat 29 (square 2 0xFFFFFF))])])])])]
    nil))
