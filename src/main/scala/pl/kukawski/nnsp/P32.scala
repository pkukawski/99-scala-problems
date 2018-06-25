package pl.kukawski.nnsp

class P32 {

  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0 => a
      case _ => gcd(b, a % b)
    }
  }

}
