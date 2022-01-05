object Question2 extends App{
  def removechar(str: String, n: Int): String = {
    str.take(n) + str.drop(n+1)
  }
  println(removechar("Scala", 1))
  println(removechar("Scala", 0))
  println(removechar("Scala", 4))
}
