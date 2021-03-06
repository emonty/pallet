(ns pallet.repl
  "A namespace that can be used to pull in most of pallet's namespaces.  uesful
  when working at the clojure REPL."
  (:use org.jclouds.compute
        pallet.utils
        pallet.core
        pallet.resource
        pallet.resource.package
        pallet.compute
        pallet.crate.automated-admin-user
        pallet.crate.public-dns-if-no-nameserver
        pallet.task.feedback
        clj-ssh.ssh))

(defmacro use-pallet
  "Macro that will use pallet's namespaces, to provide an easy to access REPL."
  []
  `(do
     (use 'org.jclouds.compute)
     (use 'pallet.utils)
     (use 'pallet.core)
     (use 'pallet.resource)
     (use 'pallet.resource.package)
     (use 'pallet.compute)
     (use 'pallet.crate.automated-admin-user)
     (use 'pallet.crate.public-dns-if-no-nameserver)
     (use 'pallet.task.feedback)
     (use 'clj-ssh.ssh)))
