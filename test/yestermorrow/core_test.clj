(ns yestermorrow.core-test
  (:require [clojure.test :refer :all]
            [clj-time.core :refer :all]
            [yestermorrow.core :refer :all]))

(deftest test-date-noon-and-accessors
  (let [d (date-noon 1986)]
    (is (= 1986 (year   d)))
    (is (= 1    (month  d)))
    (is (= 1    (day    d)))
    (is (= 12   (hour   d)))
    (is (= 0    (minute d)))
    (is (= 0    (second d)))
    (is (= 0    (milli  d)))))

(deftest test-local-date-noon-and-accessors
  (let [d (local-date-noon 1986)]
    (is (= 1986 (year   d)))
    (is (= 1    (month  d)))
    (is (= 1    (day    d)))
    (is (= 12   (hour   d)))
    (is (= 0    (minute d)))
    (is (= 0    (second d)))
    (is (= 0    (milli  d)))))
