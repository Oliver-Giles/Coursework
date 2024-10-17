import scala.io.StdIn._
object RelationalCharacters {
  def main(args: Array[String]): Unit = {
    println("Please enter a character ")
    var x = readChar()
    println("Please enter another character ")
    var y = readChar()

    println(f"$x < $y is ${x < y}")
    println(f"$x > $y is ${x > y}")
    println(f"$x <= $y is ${x <= y}")
    println(f"$x >= $y is ${x >= y}")
    println(f"$x == $y is ${x == y}")
    println(f"$x != $y is ${x != y}")
  }
}
