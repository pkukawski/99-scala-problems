package pl.kukawski.nnsp

class P08 {
  def compress(list: List[Any], accu: List[Any] = List.empty[Any]): List[Any] = {
    list match {
      case Nil => accu
      case head :: tail => compress(tail.dropWhile(_ == head), accu :+ head)
    }
  }
}