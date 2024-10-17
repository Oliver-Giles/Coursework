object curry2 {
  def main(args: Array[String]): Unit = {

    def eq(c: Char)(d: Char) = c == d

    print("aardvark".toList filter (eq('a')))
  }
}
