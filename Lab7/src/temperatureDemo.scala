import scala.io.StdIn._
import scala.math.BigDecimal
object temperatureDemo {
  def main(args: Array[String]): Unit = {
    println("\nPlease enter a temperature ")
    var temp = readInt()
    println("\nPlease enter a unit ")
    var unit = readLine()

    println(f"Temperature: ${BigDecimal(temp).toString}")

    if (unit == "Kelvin") {
      println("Unit: Kelvin")
    } else if (unit == "Centigrade") {
      println("Unit: Centigrade")
    } else if (unit == "Fahrenheit") {
      println("Unit: Fahrenheit")
    } else {
      println("Unknown unit")
    }
  }
}
