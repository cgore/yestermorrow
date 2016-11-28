(ns yestermorrow.core
  (:require [clj-time.core :refer :all]))

(defn date-noon
  "Constructs and returns a new LocalDateTime at noon.
   Specify the year, month of year, day of month. Note that month and day are
   1-indexed. Any number of least-significant components can be ommited, in which case
   they will default to 1."
  ([year]
   (date-noon year 1 1))
  ([year month]
   (date-noon year month 1))
  ([year month day]
   (date-time year month day 12)))

(defn local-date-noon
  "Constructs and returns a new DateTime in UTC at noon.
   Specify the year, month of year, day of month. Note that month and day are
   1-indexed. Any number of least-significant components can be ommited, in which case
   they will default to 1."
  ([year]
   (local-date-noon year 1 1))
  ([year month]
   (local-date-noon year month 1))
  ([year month day]
   (local-date-time year month day 12)))
