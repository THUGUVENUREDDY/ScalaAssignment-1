import org.scalatest.funsuite.AnyFunSuite
class testQuestion3a extends  AnyFunSuite {
  test("Question3a"){
    assert(Question3a.charadd("Scala")==="aScalaa")
    assert(Question3a.charadd("World")==="dWorldd")
    assert(Question3a.charadd("Scope")==="eScopee")
  }
}
