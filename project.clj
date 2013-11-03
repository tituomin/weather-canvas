(defproject weather-canvas "0.2.0-SNAPSHOT"
  :description "Project to animate and draw weather data"
  :url "http://www.github.com/tituomin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ source code path
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]
                 [org.clojure/clojurescript "0.0-1878"]
                 [compojure "1.1.5"]
                 [rm-hull/monet "0.1.8"]
                 [prismatic/dommy "0.1.1"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "0.3.3"]
            [lein-ring "0.8.7"]]

  ;; ring tasks configuration
  :ring {:handler weather-canvas.core/handler}

  ;; cljsbuild options configuration
  :cljsbuild {:builds
              {
               :prod
               {;; CLJS source code path
                :source-paths ["src/cljs" "resources/public"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/weather-production.js"

                           ;; minimal JS optimization directive
                           :optimizations :whitespace
                           :externs ["externs.js"]
                           :foreign-libs [{
                                           :file "lib/metolib/lib/metolib-combined-1.1.6.js" 
                                           :provides ["fmi.metolib"]}]

                           ;; generated JS code prettyfication
                           :pretty-print true}}
               :dev
               {;; CLJS source code path
                :source-paths ["test/cljs" "src/cljs" "resources/public"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/weather.js"

                           ;; minimal JS optimization directive
                           :optimizations :whitespace
                           :externs ["externs.js"]
                           :foreign-libs [{
                                           :file "lib/metolib/lib/metolib-combined-1.1.6.js" 
                                           :provides ["fmi.metolib"]}]

                           ;; generated JS code prettyfication
                           :pretty-print true}}
               }}

)
