object Loop1 {
  def main(args: Array[String]): Unit = {
    var lcv = 10
    // a conditional loop
    while (lcv < 20) {
      println("Value of the loop control variable is: " + lcv)
      lcv = lcv + 1
    }
  }
}
