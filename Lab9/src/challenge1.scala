object challenge1 {
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)

    for (elem <- 0 until array.length) {
      array(elem) = 0
    }
    for (elem <- 0 until array.length) {
      println(array(elem));
    }
  }
}
