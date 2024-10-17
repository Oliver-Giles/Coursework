import scala.io.StdIn._
object InputTenNumbersIntoList {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()
    println("Input 10 numbers ")
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    println(xs.reverse)
  }
}
