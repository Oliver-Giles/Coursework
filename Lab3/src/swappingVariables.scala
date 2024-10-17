object swappingVariables {
  def main(args: Array[String]): Unit = {
    var a = 1
    var b = 2

    println(f"a = $a, b = $b")

    var c = a
    a = b
    b = c

    println(f"a = $a, b = $b")
  }

}
