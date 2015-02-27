(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonal? [n]
  (loop [n n m 0]
    (cond
      (< m n)
        (if (== n (p m))
          true
          (recur n (inc m)))
      :else false)))

(println (pentagonal? 4))

(println (pentagonal? 5))
