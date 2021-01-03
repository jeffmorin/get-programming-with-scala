42 +: List(1 ,2, 3)
// res0: List[Int] = List(42, 1, 2, 3)

List(1 ,2, 3) :+ 42
// res1: List[Int] = List(1, 2, 3, 42)

List(1, 2, 3) ++ List(42)
// res2: List[Int] = List(1, 2, 3, 42)

List(1, 2, 3) ++ Nil
// res3: List[Int] = List(1, 2, 3)

//List(1) +: 3 // does not compile!
List(1) :+ 3 // correct

//3 :+ List(1)	// does not compile!
3 +: List(1)	// correct
