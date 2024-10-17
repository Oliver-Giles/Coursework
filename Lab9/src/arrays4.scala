import Array._
import scala.util.Random._
object arrays4 {
  def main(args: Array[String]): Unit = {
    var rows = 4
    var columns = 5
    var sum = 0
    var matrix = ofDim[Int](rows, columns)
    // build a matrix
    for (outer <- 0 until rows) {
      for (inner <- 0 until columns) {
        matrix(outer)(inner) = nextInt(10)
      }
    }
    // Print two dimensional array
    for (outer2 <- 0 until rows) {
      sum = 0
      for (inner2 <- 0 until columns) {
        print(f"${matrix(outer2)(inner2)}%4d")
        sum += matrix(outer2)(inner2)
      }
      println(f"$sum%4d")
    }
  }
}

