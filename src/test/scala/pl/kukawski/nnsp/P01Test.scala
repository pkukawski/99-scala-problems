package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {
  val p01 = new P01[Int]

  test("last element of empty list") {
    p01.last(List.empty) should be(None)
  }

  test("last element of single element list") {
    p01.last(List(1)) should be(Some(1))
  }

  test("last element of list") {
    p01.last(List(1, 2, 3)) should be(Some(3))
  }
}