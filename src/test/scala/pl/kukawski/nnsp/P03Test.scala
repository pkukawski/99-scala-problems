package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers {
  val p = new P03[Int]

  test("nth") {
    p.nth(-1, List()) should be(None)
    p.nth(0, List()) should be(None)
    p.nth(0, List(1)) should be(Some(1))
    p.nth(1, List(1, 2, 3)) should be(Some(2))
  }
}