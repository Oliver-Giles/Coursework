object demo4 {
  def main(args: Array[String]): Unit = {
    var age = 64366556
    var ageComment = age match {
      case 16 => "\nYou may join the army at age "
      case 18 => "\nYou may vote at age "
      case 25 => "\nYou may get cheaper driving insurance at age "
      case 67 => "\nYou may retire at age "
      case noMatches => "\nNothing seems to happen at age "
    }
      println(ageComment + age)
    }
  }

