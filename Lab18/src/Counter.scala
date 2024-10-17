class Counter {
  private var value: Int = 0
  def inc(): Unit = {
    value += 1
  }
  def getValue: Int = {
    return value
  }
  def inc(n: Int): Unit = {
    for (i <- 1 to n) inc()
  }
  def setValue(newValue: Int) = value = newValue

  def reset() = value = 0
}
