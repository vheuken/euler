(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonal? [n & [i]]
  (if (nil? i) 
    (def m 0)
    (def m i))

  (if (< m n)
    (if (== n (p m))
      true
      (if (pentagonal? n (+ m 1))
        true
        false))))

(println (pentagonal? 4))

(println (pentagonal? 5))
