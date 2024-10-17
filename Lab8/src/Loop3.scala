object Loop3 {
  def main(args: Array[String]): Unit = {
    var widgets_made = 0;
    var widgets_required = 25;
    var flag = true;
    while (flag) {
      println("Widgets made so far is: " + widgets_made);
      widgets_made += 1;   
      if (widgets_made > widgets_required) {
        flag = false;
      
      }
    }
  }
}
