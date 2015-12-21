(defn p [n] (/ (* n (- (* 3 n) 1)) 2))

(defn pentagonals
  ([]  (pentagonals 1))
  ([n] (lazy-seq (cons (p n) (pentagonals (inc n))))))

(defn pentagonal? [n lower-bound]
  (let [f (first  (pentagonals lower-bound))
        s (second (pentagonals lower-bound))]
    (loop [i (cond
               (and (odd? f) (odd? s))
                 (if (odd? n)
                   lower-bound
                   (+ 2 lower-bound))
               (and (odd? f) (even? s))
                 (if (odd? n)
                   (- lower-bound 1)
                   (+ 1 lower-bound))
               (and (even? f) (even? s))
                 (if (odd? n)
                   (+ 2 lower-bound)
                   lower-bound)
               (and (even? f) (odd? s))
                 (if (odd? n)
                   (+ 1 lower-bound)
                   (- lower-bound 1)))
           c 0]
      (let [pi (p i)]
        (cond
          (> n pi)
            (recur (if (odd? c) (+ 3 i) (inc i))
                   (inc c))
          (= n pi)
            true
          :else
            false)))))

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
