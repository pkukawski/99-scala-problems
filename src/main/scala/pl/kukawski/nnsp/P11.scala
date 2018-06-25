package pl.kukawski.nnsp

class P11 {
  def pack(list: List[Any], accu: List[List[Any]] = List.empty[List[Any]]): List[List[Any]] = {
    list match {
      case Nil => accu
      case head :: _ => pack(list.dropWhile(_ == head), accu :+ list.takeWhile(_ == head))
    }
  }

  def encodeModified(list: List[Any]): List[Any] = {
    pack(list).map {
      case head :: Nil => head
      case l => (l.size, l.head)
    }
  }
}