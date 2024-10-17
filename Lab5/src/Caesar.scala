import scala.io.StdIn._
object Caesar {
  def main(args: Array[String]): Unit = {
    println("Please enter a letter and a shift number ")
    var letter = readChar()
    var shift = readInt()
    println(f"The letter was $letter")
    if ((letter + shift) > 122)
      println(f"The encrypted letter is ${(96 + ((letter + shift) - 122 )).toChar}")
    else
      println(f"The encrypted letter is ${(letter + shift).toChar}")
  }
}
