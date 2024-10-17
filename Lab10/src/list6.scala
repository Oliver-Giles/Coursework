object list6 {
  def main(args: Array[String]): Unit = {

    // Repeats apples three times
    val fruit = List.fill(3)("apples");
    println("fruit : " + fruit);

    // Repeats 2, 10 times
    val num = List.fill(10)(2);
    println("num : " + num);
  }
}
