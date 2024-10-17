object CircleCalc {
  def main(args: Array[String]): Unit = {
    val pi = 3.14159
    val diameter = 25.0
    var circumference = pi * diameter
    println("A circle with diameter " + diameter + " has a circumference of " + circumference)
    println(f"A circle with diameter $diameter has a circumference of $circumference%1.2f")
  }
}
