
(ns weather-canvas.sheet
  (:require [weather-canvas.gradient :as gradients]
            [weather-canvas.weather :as weather]
            [dommy.utils :as utils]
            [dommy.core :as dommy])
  (:use-macros
   [dommy.macros :only [node sel sel1]]))

; ----------------------------------------------------------------------

(defn sheet [layer-specs]
  {:type   :sheet
   :layers layer-specs})

(defn group
  [direction & {:keys [interleave content offset]}]
  {:type :group
   :direction (make-direction direction)
   :interleave interleave
   :content content})

(defn gap
  [size] {:type :gap :size size})

(defn square
  [size color] {:type :square :size size :color color})

; ----------------------------------------------------------------------

(defmulti draw! (fn [shape context offset & {:keys []}] (:type shape)))

(defmethod draw! :sheet [sheet context offset]
  (let [subdimensions (for [[layer-name sub-offset contents] (reverse (:layers sheet))]
                        (draw! contents context (map + sub-offset offset)))]
    (apply map max subdimensions)))

(defmethod draw! :group [shape context offset]
  (let [dir       (:direction shape)
        forward   (make-projection dir)
        sideways  (fn [dim] (map #(.abs js/Math %) ((make-projection (+ 1 dir)) dim)))
        between   (:interleave shape)
        contents  (if (not between)
                    (:content shape)
                    (butlast
                     (flatten
                      (map vector
                           (:content shape)
                           (repeat between)))))]

    (loop [subshapes  contents
           suboffset  offset
           dimensions [0 0]]

      (if (not (first subshapes))
        dimensions
        (let [sub-dimension (draw! (first subshapes)
                                   context
                                   suboffset)
              new-width     (max (sideways sub-dimension)
                                 (sideways dimensions))]
          (recur (rest subshapes)
                 (map + (forward sub-dimension) suboffset)
                 (map + (forward dimensions)
                      (map + (forward sub-dimension) new-width))))))))


(defmethod draw! :gap [shape context offset]
  ; don't draw! anything, just return dimensions
  [(:size shape) (:size shape)])

(defmethod draw! :square [shape context offset]
  (set! (.-fillStyle context) (:color shape))
  (.fillRect context (first offset) (second offset) (:size shape) (:size shape))
  [(:size shape) (:size shape)])

; ----------------------------------------------------------------------

(defn unit-vector [direction]
  (get [[ 1  0]
        [ 0 -1]
        [-1  0]
        [ 0  1]]
       (mod direction 4)))

(def make-direction
  { :right 0
    :up    1
    :left  2
    :down  3 })

(defn make-projection [direction]
  (fn [dimension]
    (map * (unit-vector direction)
         dimension)))
