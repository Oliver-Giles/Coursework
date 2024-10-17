object challenge1 {
  def main(args: Array[String]): Unit = {
    val map1 = Map(("firstName", "Oliver"), ("lastName", "Giles"), ("houseNumber",
      124), ("town", "Swadlincote"))

    println(f"Keys in this map: ${map1.keys.mkString(", ")}")

    for ((key, value) <- map1)
      println(f"Key: $key, Value: $value")
  }
}
