object map1 {
  def main(args: Array[String]): Unit = {
    // define an immutable map who's keys are strings and values are all integer
    var santa: Map[Char, Int] = Map()
    var santa2 = Map(("name", "Santa"), ("age", 21), ("dob", "25/12/400"), ("lang", "elvish"), ("food", "mince pies"))
    var santa3 = Map("name" -> "Santa", "age" -> 21, "dob" -> "25/12/400", "lang" -> "elvish", "food" -> "mince pies")
    println("Check if santa Map is empty : " + santa.isEmpty)
    println("Check if santa2 Map is empty : " + santa2.isEmpty)
    println("Keys in santa2 Map : " + santa2.keys)
    println("Values in santa3 Map: " + santa3.values)
  }
}
