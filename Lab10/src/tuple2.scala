object tuple2 {
  def main(args: Array[String]): Unit = {
    val tup = (8, 4, 2, 1)
    tup.productIterator.foreach { value =>
      println("Value = " + value)
    }
  }
}
