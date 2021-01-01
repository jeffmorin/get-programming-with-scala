import scala.reflect.runtime.universe._

classOf[String]
// Class[String] = class java.lang.String

typeOf[String]
// res1: reflect.runtime.universe.Type = String

classOf[Option[Int]]
// res2: Class[Option[Int]] = class scala.Option

classOf[Option[Int]] == classOf[Option[String]]
// res3: Boolean = true

typeOf[Option[Int]]
// res4: reflect.runtime.universe.Type = scala.Option[Int]

typeOf[Option[String]]
// res5: reflect.runtime.universe.Type = scala.Option[String]

typeOf[Option[Int]] == typeOf[Option[String]]
// res6: Boolean = false
