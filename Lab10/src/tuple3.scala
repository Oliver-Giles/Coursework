object tuple3 {
  def main(args: Array[String]): Unit = {

    val hhgttg = (42, "Marvin", 3.141, "Arthur", true)

    println("The answer to life, the universe and everything is: " + hhgttg._1)
      println ("Concatenated String: " + hhgttg.toString())

    val tu = new Tuple2("CTEC1403", "hello")
    println("Swapped Tuple: " + tu.swap)

    val t = new Tuple3(1, "hello", Console)
    println("Concatenated String: " + t.toString())

    val tup = new Tuple4(1, "hello", "world", Console)
    println("Concatenated String: " + tup.toString())

    val tupl = new Tuple5(1,2,3,4,5)

    hhgttg.productIterator.foreach { value =>
      println("Value =  " + value) }

    tupl.productIterator.foreach {value => println(f"Value = $value")}
  }
}
