(ns puzzle.core)

(def quad
  [[0 1 2 3]
   [1 0 3 2]
   [2 3 0 1]
   [3 2 1 0]])

(defn divmod [n m]
  ((juxt (partial quot n) (partial mod n)) m))

(defn q [i j]
  (if (= i j) 0 (+ i j)))

(defn r [i j]
  (get-in quad [i j]))

(defn a [i j]
  (let [[u s] (divmod i 4)
        [v t] (divmod j 4)]
    (+ (* 4 (q u v)) (r s t))))

