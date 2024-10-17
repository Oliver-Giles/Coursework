import scala.io.StdIn._
object demo5 {
  def main(args: Array[String]): Unit = {
    println("\nPlease enter your age in word format: ")
    var age = readLine()
    var ageComment =
      age match {
        case "sixteen" => "You may join the army at age "
        case "eighteen" => "You may vote at age "
        case "twenty five" => "You may get cheaper driving insurance at age "
        case "sixty seven" => "You may retire at age "
        case _ => "Nothing seems to happen at age "
      }
    println(ageComment + age)
  }
}
