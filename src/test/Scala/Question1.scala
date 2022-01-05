import org.scalatest.funsuite.AnyFunSuite
class testQuestion1 extends  AnyFunSuite {
  test("Question1"){
    assert(Question1.newString("India")==="InInInIn")
    assert(Question1.newString("Scala")==="ScScScSc")
    assert(Question1.newString("To")==="ToToToTo")
    assert(Question1.newString("t")==="t")
  }

}
