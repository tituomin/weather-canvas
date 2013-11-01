(ns weather-canvas.sheet-test
  (:use
   [weather-canvas.sheet :only [group gap square sheet draw! direction]]
   [weather-canvas.weather :only [init-canvas]])
  (:use-macros
   [dommy.macros :only [node sel sel1]]))


(def group-1 (group (direction :right)
                    :interleave (gap 1) :content
                    [(repeat 31 (square 2 "#ffffff"))
                     (repeat 30 (square 2 "#ffffff"))]))

(def group-2 
  (group (direction :right)
         :interleave (gap 1) :content
         [(repeat 31 (square 2 "#ff00ff"))
          (repeat 30 (square 4 "#ff00ff"))
          (repeat 29 (square 2 "#ff00ff"))]))

(def container-group (group (direction :down) :interleave (gap 2)
                            :content [group-1
                                      group-2
                                      group-2
                                      group-1]))

(def sheet-1
  (sheet
   [["front" container-group]
    ["back"  (square 40 "#008800")]]))

(defn with-canvas [f]
  (let [canvas (init-canvas (sel1 :#test-weather-canvas) 10)
        context (.getContext canvas "2d")]
    (f context)))

(defn test-square []
  (with-canvas
    #(draw! (square 8 "#ffffff") % [5 5])))

(defn test-group []
  (with-canvas
    #(draw! group-2 % [0 0])))
  
(defn test-container-group []
  (with-canvas
    #(draw! container-group % [0 0])))

(defn test-sheet []
  (with-canvas
    #(draw! sheet-1 % [0 0])))
