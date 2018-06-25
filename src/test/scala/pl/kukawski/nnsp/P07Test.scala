package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P07Test extends FunSuite with Matchers {
  val p = new P07

  test("isPalindrom") {
    p.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be(List(1, 1, 2, 3, 5, 8))
  }
}