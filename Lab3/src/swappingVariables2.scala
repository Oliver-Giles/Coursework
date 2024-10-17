object swappingVariables2 {
  def main(args: Array[String]): Unit = {
    var a = 1
    var b = 2

    println(f"a = $a, b = $b")

    a = a + b
    b = a - b
    a = a - b


    println(f"a = $a, b = $b")
  }

}
