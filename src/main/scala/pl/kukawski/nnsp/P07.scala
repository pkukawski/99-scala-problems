package pl.kukawski.nnsp

class P07 {
  def flatten(list: List[Any]): List[Any] = {
    list.foldLeft(List.empty[Any]){(accu, elem) =>
      elem match{
        case l: List[_] => accu ++ flatten(l)
        case _ => accu :+ elem
      }
    }
  }
}