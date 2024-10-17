object challenge3 {
  def main(args: Array[String]): Unit = {
    var months = List("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    var sales = List(100, 90, 120, 150, 160, 170, 170, 120, 140, 100, 100, 90)
    var SPM = scala.collection.mutable.SeqMap[String, Int]()

    for (x <- 0 until months.length) {
      SPM += months(x) -> sales(x)
    }
    for ((key, value) <- SPM)
      println("Month: " + key + ", sales: " + value)
    //sales.foreach{ key => println("Month: " + key + ", sales: " + key)}
    //println(sales)
  }
}
