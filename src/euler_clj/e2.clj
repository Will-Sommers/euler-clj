(ns euler-clj.e2)

(defn get_even_fibs [bound]
  (loop [total 2
         last_two_fibs [1 2]]
    (if (< (last last_two_fibs) bound)
      (let [next_fib (apply + last_two_fibs)
            next_two_fibs (vector (last last_two_fibs) next_fib)]
        (if (even? next_fib)
          (recur (+ total next_fib) next_two_fibs)
          (recur total next_two_fibs)))
      total)))
