(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonals
  ([]  (pentagonals 1))
  ([n] (lazy-seq (cons (p n) (pentagonals (inc n))))))

(defn pentagonal? [n]
  (loop [i (if (odd? n) 1 3)
         c 0]
    (let [pi (first (take 1 (pentagonals i)))]
      (cond
        (= n pi)
          true
        (> n pi)
          (recur (if (odd? c) (+ 3 i) (inc i))
                 (inc c))
        :else
          false))))

(defn run []
  (loop [j 1 k 1]
    (let [pj (first (take 1 (pentagonals j)))
          pk (first (take 1 (pentagonals k)))
          sum (+ pk pj)
          difference (- pk pj)]
      (if (and (pentagonal? sum)
               (pentagonal? difference))
        (println "D = " difference)
        (if (>= j k)
          (recur 1 (inc k))
          (recur (inc j) k))))))

(run)
