package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P32Test extends FunSuite with Matchers {
  val p = new P32

  test("gcd") {
    p.gcd(36, 63) should be(9)
  }
}