(ns weather-canvas.canvas-buffer
  (:use-macros
   [dommy.macros :only [node sel sel1]]))

(def size-x 4)
(def size-y 16)

(defn canvas-buffer [buffer-id]
  (let [canvas (sel1 buffer-id)]
    {:canvas (init-canvas canvas 40)
     :context (.getContext canvas "2d")}))

(defn init-canvas [canvas years]
  (set! (.-width canvas) (* 370 size-x))
  (set! (.-height canvas) (* years size-y)))

(defn draw-rectangle [buffer position dimensions color]
  (let [ctx (:context buffer)]
    (set! (.-fillStyle ctx) color)
    (.fillRect ctx (first position) (second position)
               (first dimensions) (second dimensions))))

(defn draw-text [buffer text position font-size color]
  (let [ctx (:context buffer)]
    (set! (.-fillStyle ctx) color)
    (set! (.-font ctx) (str font-size "px Arial"))
    (.fillText ctx text (first position) (second position))
    [(.-width (.measureText ctx text)) font-size]
    ))
