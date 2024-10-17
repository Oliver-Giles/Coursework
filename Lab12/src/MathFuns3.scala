object MathFuns3 {
  def main(args: Array[String]): Unit = {
    def even(x: Int): Boolean = x%2==0
    def sqr(x: Int): Int = x * x
    def dbl(x: Int) = x * 2
    def odd(x : Int): Boolean = x % 2 == 1
    def inv(x: Boolean): Boolean = !x
    def neg(x: Int): Boolean = !(x >= 0)
    def pal(x: String): Boolean = x.reverse == x
    def strlen(x: String): Int = x.length
    def bracket(x: String): String = f"[$x]"

 //   println(even(5))
 //   println(even(6))
 //   println(sqr(5))
 //   println((1 to 10) map even)
 //   println((1 to 10) filter even)
 //   println((1 to 10) filter even map sqr)
 //   println(dbl(5))
 //   println((1 to 10) map dbl)

 //   println(odd(5))
 //   println(odd(6))

 //   println(inv(true))
 //   println(inv(0==4))

 //   println(neg(-439856))
 //   println(neg(56))

 //   println(pal("pop"))
 //   println(pal("flow"))

 //   println(strlen("flowers"))

 //   println(bracket("flowers"))

    def countDivisors(n: Int): Int = {
      var d: Int = 0
      for (k <- 1 until n)
        if (n % k == 0)
          d = d + 1
      d
    }

    println(countDivisors(6))

  }
}
