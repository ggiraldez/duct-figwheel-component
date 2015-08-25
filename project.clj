(defproject duct/figwheel-component "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.3"]]
  :profiles
  {:dev {:source-paths   ["dev/src/clj"]
         :resource-paths ["dev/resources"]
         :dependencies [[reloaded.repl "0.1.0"]
                        [ring-jetty-component "0.2.3"]
                        [compojure "1.4.0"]]}})