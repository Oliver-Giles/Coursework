object MoreFuns {
  val incr: Int => Int = x => x + 1
  val decr: Int => Int = x => x - 1

  def main(args: Array[String]): Unit = {
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)

    println(decr(5))
    println((1 to 10) map decr)
    println((1 to 10) map decr map decr)

    def countDivisors(n: Int): Int = {
      var d: Int = 0
      for (k <- 1 until n)
        if (n % k == 0)
          d = d + 1
      d
    }
  }
}
