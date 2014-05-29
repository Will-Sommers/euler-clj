(ns euler-clj.e71)

(def current-min 2/5)

(def max 3/7)

(defn nums-to-check
  "Reversing range should throw out previous bests more quickly"
  [bound] (reverse (range 1 bound)))

(defn get-closest-to-max [current-best next]
  (let [numerator (int (* current-best next))]
    (loop [numerator numerator
           current-best current-best]
      (let [n (/ numerator next)]
        (cond
         (>= n max) current-best
         (and (< n max)
              (> n current-best)) (recur (inc numerator) n)
         (< n max) (recur (inc numerator) current-best))))))

(defn euler-71 []
  (numerator (reduce get-closest-to-max 2/5 (nums-to-check 1000000))))



