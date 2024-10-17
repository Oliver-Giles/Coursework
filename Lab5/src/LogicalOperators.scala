import scala.io.StdIn._
object LogicalOperators {
  def main(args: Array[String]): Unit = {
    print("Please enter two Boolean values: \n")
    var x: Boolean = readBoolean()
    var y: Boolean = readBoolean()
    println(x)
    println(y)
    println(f"$x AND $y is " + (x && y))
    println(f"$x OR $y is " + (x || y))
  }
}
