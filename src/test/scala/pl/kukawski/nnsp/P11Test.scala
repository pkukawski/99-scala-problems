package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P11Test extends FunSuite with Matchers {
  val p = new P11

  test("encodeModified") {
    p.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))should
      be(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
}