package pl.kukawski.nnsp

class P16 {
  def drop(n: Int, list: List[Any], accu: List[Any] = List.empty[Any]): List[Any] = {
    list match {
      case Nil => accu
      case _ => list.splitAt(n-1) match {
        case (chunk, Nil) => accu ++ chunk
        case (chunk, _ :: tail) => drop(n, tail, accu ++ chunk)
      }
    }
  }
}