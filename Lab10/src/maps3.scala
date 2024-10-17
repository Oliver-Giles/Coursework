object maps3 {
  def main(args: Array[String]): Unit = {
    val weekdays = Array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val contactHours = Array(2, 0, 5, 3, 4)
    var weekdayContact = scala.collection.mutable.Map[String, Int]()
    var dayCount = weekdays.length

    for (lcv <- 0 until dayCount) {weekdayContact += weekdays(lcv) -> contactHours(lcv)}
    for ((key, value) <- weekdayContact)
      println("Day: " + key + ", contact hours: " + value)

    weekdayContact.foreach { key =>
      println("Day: " + key._1 + ", contact hours: " + key._2)
    }
  }
}
