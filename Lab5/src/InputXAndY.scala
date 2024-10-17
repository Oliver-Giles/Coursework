import scala.io.StdIn.readInt


object InputXAndY {
  def main(args: Array[String]): Unit = {
    println("Enter a number ")
    var x: Int = readInt()
    println("Enter another number ")
    var y: Int = readInt()
    println(f"You entered $x and $y")
    println(f"The sum is ${x + y}, and the product is ${x * y}")



  }
}
