object Question5 extends App{
  def nearestnum(x: Int, y: Int): Int = {
    val x_abs = Math.abs(x - 100)
    val y_abs = Math.abs(y - 100)
    if (x_abs == y_abs) 0
    else if (x_abs < y_abs) x
    else y
  }
  println( nearestnum(99,99))
  println( nearestnum(70,85))
  println( nearestnum(98,92))
  println(nearestnum(101,110))
  println(nearestnum(70,120))
}
