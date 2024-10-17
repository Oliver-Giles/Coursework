object UseItem {
  def main(args: Array[String]): Unit = {
    var cart: List[Item] = List(new Item("banana", 80), new Item("apple", 70), new Item("cherry", 10))
    println(cart.map(x => x.getPrice).sum)
  }
}
