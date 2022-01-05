object Question4 extends App{
  def test(str: String): String =
  {
    if (str.startsWith("if")) str else "if" + str
  }
  println(test("if else"))
  println(test("else"))


}
