(ns pallet.crate.bzr
  (:use
   [pallet.resource.package :only [packages]]))


(defn bzr
  "Install bzr"
  []
  (packages :yum ["bzr" "bzrtools"]
            :aptitude ["bzr" "bzrtools"]))
