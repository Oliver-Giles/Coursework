import scala.io.StdIn._
object challenge5 {
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)

    for (elem <- 0 until array.length) {
      println(f"Please enter number ${elem + 1}:")
      array(elem) = readInt()
    }
    println("The array elements are:")
    array.reverse.foreach(println)
  }
}
