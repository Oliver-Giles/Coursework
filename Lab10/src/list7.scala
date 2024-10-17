object list7 {
  def main(args: Array[String]): Unit = {

    val squares = List.tabulate(6)(n => n * n)
    println("squares : " + squares.mkString(", "))
    for (square <- squares)
      println("Square: " + square)

    val mul = List.tabulate(4, 5)(_ * _)
    println("mul : " + mul)
    for (value <- mul)
      println("value: " + value)
  }
}
