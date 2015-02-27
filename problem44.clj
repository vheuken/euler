(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonal? [n]
  (loop [i 0]
    (cond
      (< i n)
        (if (== n (p i))
          true
          (recur (inc i)))
      :else false)))

(println (pentagonal? 4))

(println (pentagonal? 5))
