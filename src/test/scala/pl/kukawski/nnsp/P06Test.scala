package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P06Test extends FunSuite with Matchers {
  val p = new P06[Int]

  test("isPalindrom") {
    p.isPalindrome(List()) should be(true)
    p.isPalindrome(List(1, 2)) should be(false)
    p.isPalindrome(List(1, 2, 1)) should be(true)
  }
}