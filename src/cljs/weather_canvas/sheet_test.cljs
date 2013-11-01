(ns weather-canvas.sheet-test)

(def group-1 (group :right
                    :interleave (gap 1) :content
                    [(repeat 31 (square 2 "#ffffff"))
                     (repeat 30 (square 2 "#ffffff"))]))

(def group-2 
  (group :right
         :interleave (gap 1) :content
         [(repeat 31 (square 2 "#ff00ff"))
          (repeat 30 (square 4 "#ff00ff"))
          (repeat 29 (square 2 "#ff00ff"))]))

(def container-group (group :down :interleave (gap 2) :content
                            [group-1
                             group-2
                             group-1
                             group-2]))

(defn test-sheet []
  (let [sheet-1 (sheet
                 [(layer "foreground"
                         [container-group])])]))

(defn with-canvas [f]
  (let [canvas (weather/init-canvas (sel1 :#test-weather-canvas) 10)
        context (.getContext canvas "2d")]
    (f context)))

(defn test-square []
  (with-canvas #(draw (square 8 "#ffffff") % [5 5])))

(defn test-group []
  (with-canvas #(draw group-2 % [0 0])))
  
(defn test-container-group []
  (with-canvas
    #(draw container-group % [0 0])))

