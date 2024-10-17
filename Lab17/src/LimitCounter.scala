object LimitCounter {
  private var counter = 0
  private var lowerLimit = 0
  private var upperLimit = 5

  def reset(lo: Int, up: Int): Unit = {
    counter = lo
    lowerLimit = lo
    upperLimit = up
  }
  def setLowerLimit(lo: Int): Unit = {
    lowerLimit = lo
    if (counter < lowerLimit) counter = lowerLimit
  }
  def setUpperLimit(up: Int): Unit = {
    upperLimit = up
    if (counter > upperLimit) counter = upperLimit
  }
  def setToLowerLimit(): Unit = counter = lowerLimit
  def setToUpperLimit(): Unit = counter = upperLimit
  def inc(): Unit = {
    if (counter == upperLimit) counter = lowerLimit
    else counter = counter + 1
  }
  def dec(): Unit = {
    if (counter == lowerLimit) counter = upperLimit
    else counter = counter - 1
  }
  def getLowerLimit: Int = lowerLimit
  def getUpperLimit: Int = upperLimit
  def getValue: Int = counter
  def isAtLowerLimit: Boolean = counter == lowerLimit
  def isAtUpperLimit: Boolean = counter == upperLimit

}
