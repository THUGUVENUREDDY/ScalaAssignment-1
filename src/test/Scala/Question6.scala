import org.scalatest.funsuite.AnyFunSuite
class testQuestion6 extends  AnyFunSuite {
  test("Question6"){
    assert(Question6.check(8,80)===true)
    assert(Question6.check(80,8)===true)
    assert(Question6.check(50,90)===false)
    assert(Question6.check(90,90)===false)
  }
}
