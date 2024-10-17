object UseCounter {
  def main(args: Array[String]): Unit = {
   // Counter.inc()
   // println(Counter.getValue)
   // Counter.inc(5)
   // println(Counter.getValue)

    println(LimitCounter.getValue)
    LimitCounter.inc()
    println(LimitCounter.getValue)
    LimitCounter.inc()
    println(LimitCounter.getValue)
    LimitCounter.inc()
    println(LimitCounter.getValue)

    LimitCounter.setLowerLimit(5)
    LimitCounter.setUpperLimit(7)
    println(LimitCounter.getValue)

  }
}
