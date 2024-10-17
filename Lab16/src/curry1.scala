object curry1 {
  def main(args: Array[String]): Unit = {

  def add(x: Int)(y: Int): Int = x + y
  def sub(x: Int)(y: Int): Int = y - x
  def mul(x: Int)(y: Int): Int = x * y
  def div(x: Int)(y: Int): Int = y / x
  def mod(x: Int)(y: Int): Int = y % x

  println((1 to 10) map (add(2)))
  println((1 to 10) map (sub(2)))
  println((1 to 10) map (mul(2)))
  println((1 to 10) map (div(2)))
  println((1 to 10) map (mod(2)))
  }
}