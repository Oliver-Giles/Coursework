object TicTacToe {
  import Array._
  class Player
  case object O extends Player
  case object X extends Player
  var player: Player = _
  var turn: Int = 1
  def optPlayerToChar(p: Option[Player]): Char = p match {
    case None => ' '
    case Some(O) => 'O'
    case Some(X) => 'X'
  }
  private var grid: Array[Array[Option[Player]]] = ofDim[Option[Player]](3, 3)
  /**
   * Reset the grid to an initial state. All the cells are blank.
   * Player X always starts the game
   */
  def reset() {
    player = X
    turn = 1
    for (i <- 0 to 2; j <- 0 to 2)
      grid(i)(j) = None
  }
  def showGrid() {
    println()
    for (j <- 0 to 2) {
      print(" " + optPlayerToChar(grid(0)(j)))
      print(" | " + optPlayerToChar(grid(1)(j)))
      print(" | " + optPlayerToChar(grid(2)(j)))
}
