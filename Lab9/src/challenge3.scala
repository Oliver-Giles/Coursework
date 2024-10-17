object challenge3 {
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)

    for (elem <- 0 until array.length) {
      if (elem % 2 == 0){
        array(elem) = 0
      } else {
        array(elem) = 1

      }
      println(array(elem))
    }
  }
}
