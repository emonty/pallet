(defproject pallet "0.0.1-SNAPSHOT"
  :description "Pallet - provisioning of compute nodes using jclouds"
  :url "http://github.com/hugpduncan/pallet"
  :java-source-path "src"
  :javac-fork "true"
  :main pallet.main
  :dependencies [[org.clojure/clojure "1.1.0"]
		 [org.clojure/clojure-contrib "1.1.0"]
                 [org.danlarkin/clojure-json "1.1-SNAPSHOT"]
                 [org.jclouds/jclouds-compute "1.0-SNAPSHOT"]
                 [org.jclouds/jclouds-jsch "1.0-SNAPSHOT"]
                 [org.jclouds/jclouds-log4j "1.0-SNAPSHOT"]
                 [org.jclouds/jclouds-enterprise "1.0-SNAPSHOT"]
                 [org.apache.maven/maven-settings "2.0.10"]
                 [enlive "1.0.0-SNAPSHOT"]
		 [clj-ssh "0.0.1-SNAPSHOT"]
                 [log4j/log4j "1.2.14"]
                 [com.jcraft/jsch "0.1.42"]
                 [jline "0.9.94"]]
  :dev-dependencies [[org.jclouds/jclouds-blobstore "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-azure "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-atmos "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-aws "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-rackspace "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-terremark "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-hostingdotcom "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-rimuhosting "1.0-SNAPSHOT"]
                     [org.jclouds/jclouds-gogrid "1.0-SNAPSHOT"]
                     [leiningen/lein-swank "1.2.0-SNAPSHOT"]
		     [lein-javac "0.0.2-SNAPSHOT"]
                     [autodoc "0.7.0"]]
  :repositories [["build.clojure.org" "http://build.clojure.org/releases/"]
		 ["clojars.org" "http://clojars.org/repo/"]
                 ["jclouds" "http://jclouds.googlecode.com/svn/repo"]
                 ["jclouds-snapshot" "http://jclouds.rimuhosting.com/maven2/snapshots"]]
  :autodoc {:name "Pallet"
	    :description "Pallet is used to start provision compute nodes using jclouds and chef."
	    :copyright "Copyright Hugo Duncan 2010. All rights reserved."
	    :web-src-dir "http://github.com/hugoduncan/pallet/blob/"
	    :web-home "http://hugoduncan.github.com/pallet/" })
