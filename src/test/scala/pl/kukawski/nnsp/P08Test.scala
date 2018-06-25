package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P08Test extends FunSuite with Matchers {
  val p = new P08

  test("compress") {
    p.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List('a, 'b, 'c, 'a, 'd, 'e))
  }
}