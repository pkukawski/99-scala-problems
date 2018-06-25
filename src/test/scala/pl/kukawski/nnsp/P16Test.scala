package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P16Test extends FunSuite with Matchers {
  val p = new P16

  test("decode") {
    p.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
}