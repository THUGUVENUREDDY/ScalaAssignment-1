import org.scalatest.funsuite.AnyFunSuite
class testQuestion2 extends  AnyFunSuite {
  test("Question2"){
    assert(Question2.removechar("Scala",1)==="Sala")
    assert(Question2.removechar("Scala",0)==="cala")
    assert(Question2.removechar("Scala",4)==="Scal")
  }
}
