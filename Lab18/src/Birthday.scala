class Birthday {
  private var name = ""
  private var day = 0
  private var month = 0
  private var year = 0

  def setDetails(fullName: String, DD: Int, MM: Int, YYYY: Int) = {
    name = fullName
    day = DD
    month = MM
    year = YYYY
  }
  def getName: String = name
  def getBirthday: (Int, Int, Int) = (day, month, year)
  def getDetails: (String, Int, Int, Int) = (name, day, month, year)
}
