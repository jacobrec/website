(defproject reckhard "0.1.0-SNAPSHOT"
  :description "My Personal Website"
  :url "http://reckhard.ca"
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/gpl-3.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.7.1"]
                 [hiccup "1.0.5"]
                 [compojure "1.6.1"]]

  :repl-options {:init-ns reckhard.main}
  :main reckhard.main)
