(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonal? [n & [i]]
  (if (nil? i) 
    (def m 0)
    (def m i))
  
  (loop [n n m m]
    (cond
      (< m n)
        (if (== n (p m))
          true
          (recur n (inc m)))
      :else false)))

(println (pentagonal? 4))

(println (pentagonal? 5))
