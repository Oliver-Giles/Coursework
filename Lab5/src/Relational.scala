import scala.io.StdIn._
object Relational {
  def main(args: Array[String]): Unit = {
    println("Please enter a value ")
    var x = readInt()
    println("Please enter another value ")
    var y = readInt()

    println(f"$x < $y is ${x < y}")
    println(f"$x > $y is ${x > y}")
    println(f"$x <= $y is ${x <= y}")
    println(f"$x >= $y is ${x >= y}")
    println(f"$x == $y is ${x == y}")
    println(f"$x != $y is ${x != y}")
  }
}
