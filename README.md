# left-pad.clj
[![Circle CI](https://circleci.com/gh/coldnew/left-pad.clj.svg?style=svg)](https://circleci.com/gh/coldnew/left-pad.clj)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/coldnew/left-pad.clj/master/LICENSE)

String left pad.

This library is clojure/clojurescript port of [left-pad](https://github.com/azer/left-pad), it's **NOT** recommand to use this library actually :).

[![Clojars Project](https://clojars.org/coldnew/left-pad/latest-version.svg)](http://clojars.org/coldnew/left-pad)

[Latest codox API docs](https://coldnew.github.io/left-pad.clj/).

## Dependencies

This library is designed for **both** Clojure/ClojureSript, you need following minimal version:

* Clojure 1.8.0 ↑
* ClojureScript 1.8.34 ↑

## Usage

```clojure
(ns left-pad-test.core
  (:require [coldnew.left-pad :refer [leftpad]))

(leftpad "foo" 5)
;; => "  foo"

(leftpad "foobar" 6)
;; => "foobar"

(leftpad 1 2 0)
;; => "01"

```

## Testing

This library test with [speclj](https://github.com/slagyr/speclj), to test with Clojure, use following command:

```
$ lein spec
```

If you want to test in ClojureScript, use below

```
$ lein cljsbuild test
```

## License

Copyright © 2016 Yen-Chin, Lee <<coldnew.tw@gmail.com>>

Distributed under the [MIT License](http://opensource.org/licenses/MIT).
