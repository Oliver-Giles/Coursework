import scala.io.StdIn._
object InOutStrings {
  def main(args: Array[String]): Unit = {
    var title: String = readLine("Enter your title ")
    var firstName: String = readLine("Enter your first name ")
    var lastName: String = readLine("Enter your last name ")
    print("Enter your initial ")
    var initial = readChar()
    print("Enter your house number ")
    var house = readInt()

    println(f"Your name is $title $firstName $lastName, first initial: $initial, house number: $house")
  }
}
