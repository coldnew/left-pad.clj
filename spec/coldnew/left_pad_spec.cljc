(ns coldnew.left-pad-spec
  (#?(:clj  :require
      :cljs :require-macros)
   [speclj.core :refer [describe it should should-not]])
  (:require [speclj.run.standard :refer [run-specs]]
            [coldnew.left-pad :refer [leftpad]]))

(describe
 "Testing left-pad()"

 (it "Compatible with left-pad.js"
     (should (= "  foo"  (leftpad "foo" 5)))
     (should (= "foobar" (leftpad "foobar" 6)))
     (should (= "01"     (leftpad 1 2 0)))
     (should (= "-1"     (leftpad 1 2 "-")))))