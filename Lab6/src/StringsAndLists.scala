object StringsAndLists {
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little",
      "lamb")
    println(s1.map( _.head ).mkString(" ").toUpperCase)
    println(s1.mkString(" "))
  }
}
