package pl.kukawski.nnsp

class P06[T] {
  def isPalindrome(list: List[T]): Boolean = {
    list.reverse == list
  }
}