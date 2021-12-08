

sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]

/** Напишите свои решения в виде функций. */
object RecursiveData {
  def main(args: Array[String]): Unit = {

  }
  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.



  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = {
    list match {
      case Cons(head, tail) => false
      case _ => true
    }
  }

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.



  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = {
    list match {
      case Cons(head, tail) => head
      case _ => -1
    }
  }

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?


  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */
  sealed trait Tree[A]
  case class node[A](left: Tree[A], right: Tree[A]) extends Tree[A]
  case class leaf[A](value: A) extends Tree[A]
}
