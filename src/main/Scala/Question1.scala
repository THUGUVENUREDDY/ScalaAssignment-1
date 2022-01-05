object Question1 extends App {
  def newString(str: String): String =
  {
    if (str.length < 2) str
    else str.substring(0, 2) * 4
  }
  println(newString("India"))

}
