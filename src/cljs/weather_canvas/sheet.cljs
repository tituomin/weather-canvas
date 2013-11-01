
(ns weather-canvas.sheet
  (:require [weather-canvas.gradient :as gradients]
            [weather-canvas.weather :as weather]
            [dommy.utils :as utils]
            [dommy.core :as dommy])
  (:use-macros
   [dommy.macros :only [node sel sel1]]))

(defmulti draw! (fn [shape context offset] (:type shape)))

(defn sheet [layers]
  {:type :sheet :layers layers})

(defn layer [name groups]
  {:type :layer :name name :groups groups})

(defn group
  [direction & {:keys [interleave content]}]
  {:type :group
   :direction direction
   :interleave interleave
   :content content})

(defn unit-vector [direction]
  (get [[ 1  0]
        [ 0 -1]
        [-1  0]
        [ 0  1]]
       (mod direction 4)))

(def direction-num
  { :right 0
    :up    1
    :left  2
    :down  3 })

(defn make-projection [direction]
  (fn [dimension]
    (map * (unit-vector direction)
         dimension)))

(defmethod draw! :group [shape context offset]
  ; todo return dimensions
  (let [direction (direction-num (:direction shape))
        forward   (make-projection direction)
        sideways  (fn [dim] (map #(.abs js/Math %) ((make-projection (+ 1 direction)) dim)))
        between   (:interleave shape)
        contents  (if (not between)
                    (:content shape)
                    (butlast
                     (flatten
                      (map vector
                           (:content shape)
                           (repeat between)))))]

    (loop [subshapes contents
           suboffset offset
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
                 (map + (forward dimensions)    new-width)))))))

(defn gap
  [size] {:type :gap :size size})

(defmethod draw! :gap [shape context offset]
  ; don't draw! anything, just return dimensions
  [(:size shape) (:size shape)])


(defn square
  [size color] {:type :square :size size :color color})

(defmethod draw! :square [shape context offset]
  (set! (.-fillStyle context) (:color shape))
  (.fillRect context (first offset) (second offset) (:size shape) (:size shape))
  [(:size shape) (:size shape)])

