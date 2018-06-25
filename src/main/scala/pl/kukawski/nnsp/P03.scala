package pl.kukawski.nnsp

class P03[T] {
  def nth(n: Int, list: List[T]): Option[T] = {
    if(n >= 0 && n < list.size) {
      Some(list(n))
    } else {
      None
    }
  }
}