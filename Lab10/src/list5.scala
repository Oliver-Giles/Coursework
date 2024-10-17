object list5 {
  def main(args: Array[String]): Unit = {
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)
    val fruit3 = "cherry" :: ("kiwi" :: Nil)

    // use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruit)

    // use two lists with Set.:::() method
    fruit = fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) : " + fruit)

    // pass two or more lists as arguments
    fruit = List.concat(fruit1, fruit2, fruit3)
    println("List.concat(fruit1, fruit2, fruit3) : " + fruit)
  }
}