package pl.kukawski.nnsp

class P09 {
  def pack(list: List[Any], accu: List[Any] = List.empty[Any]): List[Any] = {
    list match {
      case Nil => accu
      case head :: _ => pack(list.dropWhile(_ == head), accu :+ list.takeWhile(_ == head))
    }
  }
}