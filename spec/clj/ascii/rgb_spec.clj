(ns ascii.rgb-spec
  (:require [ascii.rgb :as sut]
            [speclj.core :refer :all]))

(describe "RBG conversions"

  (context "rgb -> grayscale (NTSC)"

    (it "red"
      (should= 76.245 (sut/rgb->gray [255 0 0]) 0.001))

    (it "green"
      (should= 149.685 (sut/rgb->gray [0 255 0])))

    (it "blue"
      (should= 29.07 (sut/rgb->gray [0 0 255])))

    (it "others"
      (should= 225.93 (sut/rgb->gray [255 255 0]))
      (should= 178.755 (sut/rgb->gray [0 255 255]))
      (should= 156.118 (sut/rgb->gray [91 193 137])))))