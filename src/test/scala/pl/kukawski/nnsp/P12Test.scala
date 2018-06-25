package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P12Test extends FunSuite with Matchers {
  val p = new P12

  test("decode") {
    p.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should
      be(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
}