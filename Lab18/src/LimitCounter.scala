class LimitCounter {
  private var counter = 0
  private var lower = 0
  private var upper = 10

  def setValues(lo: Int, up: Int) = {
    lower = lo
    upper = up
    counter = lo
  }
  def setValues(lo: Int, up: Int, ctr: Int) = {
    lower = lo
    upper = up
    counter = ctr
  }
  def reset(lo: Int, up: Int) = {
    lower = lo
    upper = up
    counter = lo
  }
  def setLowerLimit(lo: Int) = {
    lower = lo
    if (counter < lower) counter = lower
  }
  def setUpperLimit(up: Int) = {
    upper = up
    if (counter > upper) counter = upper
  }
  def setToLowerLimit() = counter = lower
  def setToUpperLimit() = counter = upper
  def inc() = counter += 1
  def dec() = counter -= 1
  def getLowerLimit: Int = lower
  def getUpperLimit: Int = upper
  def getValue: Int = counter
  def isAtLowerLimit: Boolean = counter == lower
  def isAtUpperLimit: Boolean = counter == upper
}
