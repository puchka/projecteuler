(ns projecteuler)

(defn problem1 []
(reduce (fn [result n]
  (if (or (= (mod n 3) 0) (= (mod n 5) 0))
    (+ result n)
    (+ result 0)
  )
) 0 (range 1000)))
