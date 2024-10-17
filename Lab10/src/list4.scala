object list4 {
  def main(args: Array[String]): Unit = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil));
    val nums = Nil;
    println("Head of fruit : " + fruit.head);
    println("Tail of fruit : " + fruit.tail);
    println("Number of fruit in list : " + fruit.length);
    println("Check if fruit is empty : " + fruit.isEmpty);
    println("Check if nums is empty : " + nums.isEmpty);
  }
}
