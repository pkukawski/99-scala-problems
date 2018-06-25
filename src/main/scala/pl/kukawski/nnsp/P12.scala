package pl.kukawski.nnsp

class P12 {
  def decode(list: List[(Int, Any)]): List[Any] = {
    list.foldLeft(List.empty[Any]){case (accu, (size, elem)) =>
      accu ++ List.fill(size)(elem)
    }
  }
}