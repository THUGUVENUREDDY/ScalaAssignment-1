import org.scalatest.funsuite.AnyFunSuite
class testQuestion4 extends  AnyFunSuite {
  test("Question4") {
    assert(Question4.test("if else") === "if else")
    assert(Question4.test("if they")==="if they")
  }
}