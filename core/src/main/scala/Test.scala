import scala.concurrent._
import scala.util._
import ExecutionContext.Implicits.global
import Macros._

object Test extends App {
  class D extends Lifter {
    def x = 2
  }

  val d = new D
  d.asyncX onComplete {
    case Success(x) => println(x)
    case Failure(_) => println("failed")
  }
}
