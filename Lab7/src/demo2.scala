object demo2 {
  def main(args: Array[String]): Unit = {
    var x = "10";
    if (x.toInt == 10) {
      println("Value of X is 10");
    } else if (x.toInt == 20) {
      println("Value of X is 20");
    } else if (x.toInt == 30) {
      println("Value of X is 30");
    } else {
      println("This is the final else statement\n");
      println("All previous boolean expressions evaluated as false");
    }
  }
}
