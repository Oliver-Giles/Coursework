object lists1 {
  def main(args: Array[String]): Unit = {
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")
    println("Fruits available are " + fruit)
    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)
    // Empty List.
    val empty: List[Nothing] = List()
    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  }
}
