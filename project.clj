(defproject weather-canvas "1.0.1"
  :description "Project to animate and draw weather data"
  :url "http://www.github.com/tituomin/weather-canvas"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ source code path
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "1.2.603"]
                 [org.clojure/clojurescript "1.10.758"]
                 [compojure "1.1.5"]
                 [prismatic/dommy "1.1.0"]
                 [hipo "0.5.2"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "1.1.8"]
            [lein-ring "0.8.7"]]

  ;; ring tasks configuration
  :ring {:handler weather-canvas.core/handler}

  ;; cljsbuild options configuration
  :cljsbuild {:builds
              {
               :dev
               {;; CLJS source code path
                :source-paths ["test/cljs" "src/cljs" "data/cljs" "resources/public"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/weather.js"

                           ;; minimal JS optimization directive
                           :optimizations :whitespace
                           :fingerprint false
                           :externs ["externs.js"]
                           :foreign-libs [{
                                           :file "lib/metolib/lib/metolib-combined-1.1.6.js" 
                                           :provides ["fmi.metolib"]}]

                           ;; generated JS code prettyfication
                           :pretty-print true}}
               }
              }

)
