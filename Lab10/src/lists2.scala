object lists2 {
  def main(args: Array[String]): Unit = {
    // create a list from a range// create a list from a range

    val numbers = List.range(0, 10)
    println("numbers list contains : " + numbers)
    // create a list from a range with the specified interval
    val steppedNumbers = List.range(0, 10, 2)
    println("numbers list contains : " + steppedNumbers)
  }
}
