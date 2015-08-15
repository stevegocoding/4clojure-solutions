(ns my-4clojure-solutions.solutions)


;; 15. Double Down
(defn double-down
  [x]
  (* x 2))

;; 16. Hello World
(defn hello-world
  [x]
  (str "Hello, " x "!"))


;; 21. Nth Element
(defn nth-element
  [col n]
  (if (zero? n)
    (first col)
    (recur (rest col) (- n 1))))

;; 22. Count a Sequence
(defn count-a-sequence
  [s]
  (reduce + (map (constantly 1) s)))

;; 23. Reverse a Sequence
(defn reverse-a-sequence
  [s]
  (reduce conj () s))



;; 25. Find the odd numbers
(defn find-odd-numbers
  [s]
  (filter #(odd? %) s))

;; 27. Palindrome Detector
(defn palindrome-detector
  [s]
  (= (seq s) (reduce conj () s)))


;; 71. Rearranging Code


;; 134. A nil key
(defn a-nil-key
  [k m]
  (if (contains? m k)
    (= (k m) nil)
    false))

;; 156. Map Defaults
(defn map-defaults
13  [v keys]
  (reduce #(assoc %1 %2 v) {} keys))
