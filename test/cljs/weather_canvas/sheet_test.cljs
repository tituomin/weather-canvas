(ns weather-canvas.sheet-test
  (:use
   [weather-canvas.sheet         :only [text group gap square sheet draw! direction]]
   [weather-canvas.canvas-buffer :only [canvas-buffer]]
   [weather-canvas.weather       :only [init-canvas]])
  (:use-macros
   [dommy.macros                 :only [node sel sel1]]))


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

(def container-group (group :down :interleave (gap 2)
                            :content [group-1
                                      group-2
                                      group-2
                                      group-1]))

(def text-group
   (group :right
          :interleave (gap 5) :content
          (for [s ["tammi" "helmi" "maalis" "huhti" "touko" "kesä"
                   "heinä" "elo" "syys" "loka" "marras" "joulu"]]
            (text s 10 "#ffffff"))))

(def text-group-2
   (group :down
          :interleave (gap 5) :content
          (for [s (map str (range 1980 2013))]
            (text s 10 "#ffffff"))))

(def sheet-1
  (sheet
   [["front" [5 5]   container-group]
    ["back"  [100 10] (square 40 "#008800")]]))

(defn with-canvas [f]
  (let [canvas (init-canvas :#test-weather-canvas 10)
        context (.getContext canvas "2d")]
    (f context)))


(defn with-buffer [f]
  (let [buffer (canvas-buffer :#test-weather-canvas)]
    (f buffer)))

(defn test-square []
  (with-buffer
    #(draw! (square 8 "#ffffff") % [5 5])))

(defn test-group []
  (with-buffer
    #(draw! group-2 % [0 0])))

(defn test-group-1 []
  (with-buffer
    #(draw! group-1 % [0 0])))

(defn test-container-group []
  (with-buffer
    #(draw! container-group % [0 0])))

(defn test-sheet []
  (with-buffer
    #(draw! sheet-1 % [0 0])))

(defn test-text []
  (with-buffer
    #(draw! text-group-2 % [10 10])))

