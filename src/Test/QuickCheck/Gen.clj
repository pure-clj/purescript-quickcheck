(ns Test.QuickCheck.Gen._foreign
  (:import java.nio.ByteBuffer))

(defn float32ToInt32 [^double n]
  (let [^ByteBuffer bb (ByteBuffer/allocate 4)]
    (.putFloat bb (float n))
    (.getInt bb 0)))
