import scala.io.StdIn._
object Loop4 {
  def main(args: Array[String]): Unit = {
    var outer = 1;
    var inner = 1;
    print("How many units for the base of the triangle? ");
    var base: Int = readInt();
    while (outer <= base) {
      inner = 1
      while (inner <= outer) {
        print('*');
        inner += 1;
      }
      println("\n");
      outer += 1;
    }
  }
}
