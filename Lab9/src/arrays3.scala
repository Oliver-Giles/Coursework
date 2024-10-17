import Array._
object arrays3 {
  def main(args: Array[String]): Unit = {
    var rows = 4
    var columns = 3
    var matrix = ofDim[Int](rows, columns)
    // assign values manually to the array
    matrix(0)(0) = 5
    matrix(3)(2) = 8
    matrix(2)(0) = 1
    matrix(1)(2) = 2
    // Print two dimensional array
    for (outer2 <- 0 until rows) {
      for (inner2 <- 0 until columns) {
        print(" " + matrix(outer2)(inner2))
      }
      println()
    }
  }
}
