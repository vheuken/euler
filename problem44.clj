(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonals
  ([]  (pentagonals 1))
  ([n] (lazy-seq (cons (p n) (pentagonals (inc n))))))

(defn pentagonal? [n lower-bound]
  (loop [i lower-bound]
    (let [pi (p i)]
      (cond
        (> n pi)
          (recur (inc i))
        (= n pi)
          true
        :else
          false))))

(defn run []
  (loop [j 1 k 1]
    (let [pj (p j)
          pk (p k)]
      (if (and (pentagonal? (+ pk pj) k)
               (pentagonal? (- pk pj) 1))
        (do
          (println "J = " j)
          (println "K = " k)
          (println "D = " (- pk pj)))
        (if (>= j k)
          (recur 1 (inc k))
          (recur (inc j) k))))))

(run)
