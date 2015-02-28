(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonal? [n]
  (loop [i 1]
    (cond
      (<= i n)
        (if (== n (p i))
          true
          (recur (inc i)))
      :else false)))


(loop [n 1 modifier 4]
  (println (pentagonal? n))
  (recur (+ n modifier) (+ 3 modifier)))
