object tuple1 {
  def main(args: Array[String]): Unit = {

    val tup = (8, 4, 2, 1, 5, 3)
    val sum = tup._1 + tup._2 + tup._3 + tup._4 + tup._5 + tup._6

    println("Sum of elements: " + sum)

  }
}
