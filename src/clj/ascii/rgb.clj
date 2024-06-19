(ns ascii.rgb)

(defn rgb->gray [[r g b]]
  (+ (* 0.299 r)
     (* 0.587 g)
     (* 0.114 b)))