object Loop6 {
  def main(args: Array[String]): Unit = {
    var lcv = 1
    var loop_start = 7
    var loop_finish = 15
    for (lcv <- loop_start until loop_finish) {
      println("loop control variable value is " + lcv)
    }
  }
}
