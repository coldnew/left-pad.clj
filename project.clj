(defproject coldnew/left-pad "1.0.0"
  :description "Left pad strings"
  :url "https://github.com/coldnew/left-pad.clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.34"]]

  :source-paths ["src"]
  :test-paths ["spec"]

  :profiles {:dev {:dependencies [[speclj "3.3.1"]]}}
  :plugins [[speclj "3.3.1"]
            [lein-codox "0.9.4"]
            [lein-cljsbuild "1.1.2"]]

  :cljsbuild {:builds {:dev  {:source-paths ["src" "spec"]
                              :compiler     {:output-to "target/left-pad.js"
                                             :optimizations :simple}
                              :notify-command ["phantomjs" "bin/speclj" "target/left-pad.js"]}
                       :prod {:source-paths  ["src"]
                              :compiler      {:output-to "target/left-pad.js"
                                              :optimizations :advanced}}}
              :test-commands {"test" ["phantomjs"  "bin/speclj" "target/left-pad.js"]}}

  :deploy-repositories [["releases" :clojars]]

  :codox {:source-uri "https://github.com/coldnew/left-pad.clj/blob/master/{filepath}#L{line}"})
