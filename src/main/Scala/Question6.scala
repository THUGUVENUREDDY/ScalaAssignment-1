object Question6 extends App{
  def check(x: Int, y: Int): Boolean =
  {
    (x <= 20 && y >=  50) || (y <= 20 && x >= 50)
  }
  println(check(8,80))
}
