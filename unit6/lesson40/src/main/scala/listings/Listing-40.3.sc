import scala.util.{Try, Success, Failure}
import scala.util.control.NonFatal

object Try {

  def apply[T](r: => T): Try[T] =
    try Success(r) catch {
      case NonFatal(e) => Failure(e)
    }
}
