object countdown {
  def main(args: Array[String]): Unit = {

    def countdown(n: Int): Unit = {
      print(s"$n ")
      if (n == 0)
        println("Stopped")
      else
        countdown(n - 1)
    }

    def countToTen(n: Int): Unit = {
      print(s"$n ")
      if (n >= 10)
        println("Stopped")
      else
        countToTen(n + 1)
    }


    def countToN(a: Int, b: Int): Unit = {
      for (i <- a to b) {
        println(f"$i ")
      }
    }
      def reverseCountToN(a: Int, b: Int): Unit = {
        print(s"$b ")
        if (a >= b )
          println("Stopped")
        else
          reverseCountToN(a, b - 1)
      }

    def sumFromTo(a: Int, b: Int): Int = {
      if (a >= b)
        a
      else
        a + sumFromTo(a + 1, b)
    }

     // countdown(5)
     // countToTen(59)
     // countToN(5, 12)
     // reverseCountToN(5, 12)
     println(sumFromTo(2, 8))
  }
}