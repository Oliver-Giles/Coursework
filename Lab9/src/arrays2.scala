object arrays2 {
  def main(args: Array[String]): Unit = {
    var priceList = Array(2.5, 5.6, 1.8, 4.9, 3.7)

    for (price <- 0 until priceList.length) {
      println(priceList(price))
    }
    var total = 0.0
    for (lcv <- 0 until priceList.length) {
      total += priceList(lcv)
    }
    println("Total is " + total)

    var maxPrice = priceList(0)
    var priceLength = priceList.length
    for (lcv <- 1 until priceLength) {
      if (priceList(lcv) > maxPrice)
        maxPrice = priceList(lcv)
    }
    var minPrice = priceList(0)
    for (lcv <- 1 until priceLength) {
      if (priceList(lcv) < minPrice)
        minPrice = priceList(lcv)
    }
    
    println("The maximum price is " + maxPrice)
    println("The minimum value is " + minPrice)
    var avgPrice = total / priceLength
    println("Average price is " + avgPrice)
    }
}