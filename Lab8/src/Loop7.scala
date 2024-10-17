object Loop7 {
  def main(args: Array[String]): Unit = {
    var lcv = 0
    var loop_start = 0
    var loop_finish = 15
    for (
      lcv <- loop_start to loop_finish by +3
      if lcv % 2 == 1
    ) println(lcv)
  }
}
