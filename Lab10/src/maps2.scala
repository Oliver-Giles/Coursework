object maps2 {
  def main(args: Array[String]): Unit = {

    // define a mutable map who's keys and values are string
    var santa = scala.collection.mutable.Map[String, String]()

    santa("name") = "Santa"
    santa += "age" -> "21"
    santa("dob") = "25/12/400"
    santa.put("lang", "elvish")

    println("\nCheck if santa Map is empty: " + santa.isEmpty)
    println("\nKeys in santa Map : " + santa.keys.mkString(", "))
    println("\nValues in santa Map: " + santa.values.mkString(", "))


    santa.foreach { key => println("\t" + key._1 + " = " + key._2) }
  }
}
