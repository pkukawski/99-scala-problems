package pl.kukawski.nnsp

class P10 {
  def pack(list: List[Any], accu: List[List[Any]] = List.empty[List[Any]]): List[List[Any]] = {
    list match {
      case Nil => accu
      case head :: _ => pack(list.dropWhile(_ == head), accu :+ list.takeWhile(_ == head))
    }
  }

  def encode(list: List[Any]): List[(Int, Any)] = {
    pack(list).map(list => (list.size, list.head))
  }
}