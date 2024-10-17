import scala.io.StdIn._
object SumCubesToN {
  def main(args: Array[String]): Unit = {
    println("Please enter a number ")
    var n = readInt()
    var sumCubes = (n * n) * ((n + 1) * (n + 1)) / 4
    println(f"The answer is $sumCubes")
  }
}
