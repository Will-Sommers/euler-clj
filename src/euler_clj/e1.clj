(ns euler-clj.e1)

(defn sum_multiples [max]
  (reduce
   (fn [coll n]
     (if (or (= 0 (mod n 5))
             (= 0 (mod n 3)))
       (+ coll n)
       coll))
   0
   (range max)))

(sum_multiples 1000)


