import scala.util.Random._
object challenge4 {
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)
    var sum = 0

    for (elem <- 0 until array.length) {
      array(elem) = nextInt(100)
      sum += array(elem)
      println(array(elem))
    }
    println(sum)
  }
}
