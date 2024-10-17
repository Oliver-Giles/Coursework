import scala.math.BigDecimal
object scientificNot {
  def main(args: Array[String]): Unit = {

    val bigNumber = BigDecimal("12345678901234567890")
    val scientificNotation = bigNumber.bigDecimal.toString

    println(s"Scientific Notation: ${scientificNotation}%e")
  }
}
