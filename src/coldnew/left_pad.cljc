(ns coldnew.left-pad
  (:require #?(:clj  [clojure.pprint :refer [cl-format]]
               :cljs [cljs.pprint    :refer [cl-format]])))

(defn leftpad
  "If S is shorter than LEN, pad it with CH on the left."
  ([s len] (leftpad s len " "))
  ([s len ch]
   (cl-format nil (str "~" len ",'" ch "d") (str s))))
