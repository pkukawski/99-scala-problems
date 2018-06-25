package pl.kukawski.nnsp

import org.scalatest.{FunSuite, Matchers}

class P09Test extends FunSuite with Matchers {
  val p = new P09

  test("pack") {
    p.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))should
      be(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
}