object UseCounter {
  def main(args: Array[String]): Unit = {

    //var counter1: Counter = new Counter()
    //var counter2: Counter = new Counter()

    var counter3: LimitCounter = new LimitCounter()

   // println(f"Counter 3 is: ${counter3.getValue}")
    counter3.inc()
    //println(f"Counter 3 is: ${counter3.getValue}")
    counter3.setValues(5, 15, 7)
    println(f"Counter 3 is: ${counter3.getValue}")
    println(counter3.isAtLowerLimit)
    counter3.dec()
    counter3.dec()
    println(counter3.isAtLowerLimit)

  }
}
