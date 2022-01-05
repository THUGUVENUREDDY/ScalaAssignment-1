object Question3 extends App{
  def charadd(str: String, n: Int): String = {
    str.drop(n - 1)+str.take(n)+str.drop(n-1)
  }
  println(charadd("Scala", 5))
}
