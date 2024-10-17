object Operators {
  def main(args: Array[String]): Unit = {
    var y: Int = 5
    var z = 10
    println("1 x " + y + " = " + (1 * y))
    println("10 x " + y + " = " + (10 * y))
    println("100 x " + y + " = " + (100 * y))
    println(f"Sum = ${y + z}")
    println(f"Product = ${y * z}")
    println(f"Difference = ${y - z}")
    println(f"Sum of squares = ${(y * y) + (z * z)}")
  }
}
