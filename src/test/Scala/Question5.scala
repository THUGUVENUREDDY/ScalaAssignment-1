import org.scalatest.funsuite.AnyFunSuite
class testQuestion5 extends  AnyFunSuite {
  test("Question5"){
    assert(Question5.nearestnum(99,99)===0)
    assert(Question5.nearestnum(70,85)===85)
    assert(Question5.nearestnum(98,92)===98)
    assert(Question5.nearestnum(101,110)===101)
    assert(Question5.nearestnum(70,120)===120)
  }

}
