
(ns weather-canvas.sheet
  (:require [weather-canvas.gradient :as gradients]
            [dommy.utils :as utils]
            [dommy.core :as dommy])
  (:use-macros
   [dommy.macros :only [node sel sel1]]))

(defmulti draw (fn [shape context offset] (:type shape)))

(defn sheet [layers]
  {:type :sheet :layers layers})

(defn layer [name groups]
  {:type :layer :name name :groups groups})


(defn group
  [direction & {:keys [interleave]} attributes]
  {:type :group
   :direction direction
   :interleave interleave
   :content content})

(def unit-vector {:up    [-1  0]
                  :down  [ 1  0]
                  :left  [ 0 -1]
                  :right [ 0  1]})

(defmethod draw :group [shape context offset]
  (let [increment (fn [dimension]
                    (map * ((:direction shape) unit-vector) dimension))
        between   (:interleave shape)
        contents  (if (not between)
                    (:contents shape)
                    ; else
                    (butlast
                     (flatten
                      (map vector
                           (:contents shape)
                           (repeat between)))))]

    (loop [subshape (first contents)
           suboffset offset]
      (if (not subshape)
        true
        (let [delta (increment
                     (draw subshape context
                           suboffset))]
          (recur (rest contents) (map + suboffset delta)))))))


(defn gap
  [size] {:type :gap :size 1})

(defmethod draw :gap [shape context offset]
  ; don't draw anything, just return dimensions
  ([(:size shape) (:size shape)]))


(defn square
  [size color] {:type :square :size size :color color})

(defmethod draw :square [shape context offset]
  (set! (.-fillStyle context) (:color shape))
  (.fillRect context (first offset) (second offset) (:size shape) (:size shape))
  ([(:size shape) (:size shape)]))

;(defmethod draw :group)


;(defmethod draw :la)

(def group-1 (group :right :interleave (gap 1) :content
                                         [(repeat 31 (square 2 0xFFFFFF))
                                          (repeat 30 (square 2 0xFFFFFF))]))

(def group-2 
  (group :right :interleave (gap 1) :content
         [(repeat 31 (square 2 0xFFFFFF))
          (repeat 30 (square 2 0xFFFFFF))
          (repeat 29 (square 2 0xFFFFFF))]
         ))

(def container-group (group :down :interleave (gap 2)
                                 [group-1
                                  group-2]))

(defn test-sheet []
  (let [sheet-1 (sheet
                 [(layer "foreground"
                         [container-group])]
                 )
        ]))

(defn test-1 []
  (let [canvas (sel1 :#test-weather-canvas)
        context (.getContext canvas "2d")]
;    (.log js/console context)
    (draw (square 8 "#ffffff") context [5 5])))
;    (draw group-2 context [0 0])
