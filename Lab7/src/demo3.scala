object demo3 {
  def main(args: Array[String]): Unit = {
    var x = 30
    var y = 50
    var z = 40
    if (x == 30) {
      if (y == 10) {
        println("X = 30 and Y = 10")
      } else {
        if (y == 20) {
          println("X = 30 and Y = 20")
        }  else {
           if (z == 40) {
             println("X = 30 and z = 40")
           }
         }
      }
    }
  }
}