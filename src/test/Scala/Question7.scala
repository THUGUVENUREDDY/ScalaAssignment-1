import org.scalatest.funsuite.AnyFunSuite
class testQuestion7 extends  AnyFunSuite {
  test("Question7"){
    assert(Question7.happystringorNot("venureddy",6)==="not happy")
    assert(Question7.happystringorNot("venureddy",4)==="not happy")
    assert(Question7.happystringorNot("venureddy",7)==="happy")
  }

  }