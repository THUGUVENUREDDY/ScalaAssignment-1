object Question3a extends App{
  def charadd(str: String): String =
  {
    val len = str.length
    val last = str.charAt(len - 1)
    last + str + last
  }
  println(charadd("Scala"))

}
