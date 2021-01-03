List(1, 2, 3)
// res0: List[Int] = List(1, 2, 3)
// The inferred type is List[Int] as all the elements are of type Int

List("Hello", "Scala", "!")
// res1: List[String] = List(Hello, Scala, !)
// The inferred type is List[String]

List(1, 2, 42.24)
// res2: List[Double] = List(1.0, 2.0, 42.24)
// The inferred type is List[Double] because the compiler can
// automatically convert elements of type Int to Double

List(42, "Scala")
// res3: List[Any] = List(42, Scala)
// The inferred type is List[Any] because the first common type
// between an Int and a String is Any (i.e., the root of the Scala class hierarchy)

val ints: List[Int] = Nil
// ints: List[Int] = List()

val strings: List[String] = Nil
// strings: List[String] = List()

//::(1, ::(2, Nil))
// res0: scala.collection.immutable.::[Int] = List(1, 2)

1 :: 2 :: Nil
// res4: List[Int] = List(1, 2)

