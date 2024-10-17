object MultipleArgs {

  def largerOf(c: Int, d: Int): Int = if (c > d) c else d

  def smallerOf(c: Int, d: Int): Int = if (c > d) d else c

  def smallerOf3(c: Int, d: Int, e: Int): Int = if (e > smallerOf(c, d)) smallerOf(c, d) else e

  def medianOf3(c: Int, d: Int, e: Int): Int = List(c, d, e).sorted.tail.head

  def gcd(a: Int, b:Int): Int = {
    var x = a
    var y = b
    while (x != y) {
      while (x < y) y = y - x
      while (y < x) x = x - y
    };
    x

  }

  def main(args: Array[String]): Unit = {
  //  for (a <- 1 to 3; b <- 1 to 3)
  //    println(s"Larger of $a and $b is ${largerOf(a, b)}")

  //    for (a <- 1 to 3; b <- 1 to 3)
  //      println(s"Smaller of $a and $b is ${smallerOf(a, b)}")

  //      for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
  //        println(s"Smaller of $a, $b and $c is ${smallerOf3(a, b, c)}")

  //        for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
  //         println(s"Median of $a, $b and $c is ${medianOf3(a, b, c)}")
  }

}
