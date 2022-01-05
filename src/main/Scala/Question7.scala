object Question7 extends App{
  def happystringorNot(str:String,n:Int): String ={
    val l =str.length
    if(n>=0 && n<l){
      if(n==l-1){
        if(str.charAt(n) == str.charAt(n-1))"happy"
        else "not happy"
      }
      else if (n==0){
        if(str.charAt(n) == str.charAt(n+1)) "happy"
        else "not happy"
      }
      else if (str.charAt(n) == str.charAt(n-1))"happy"
      else "not happy"
    }
    else "please provie a Valid Index"
  }
  println(happystringorNot("venureddy",6))
  println(happystringorNot("venureddy",4))

}
