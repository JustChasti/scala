import scala.annotation.tailrec

/** Реализуйте функции для решения следующих задач.
  * Примечание: Попытайтесь сделать все функции с хвостовой рекурсией, используйте аннотацию для подстверждения.
  * рекурсия будет хвостовой если:
  *   1. рекурсия реализуется в одном направлении
  *   2. вызов рекурсивной функции будет последней операцией перед возвратом
  */
object RecursiveFunctions {
  def main(args: Array[String]): Unit = {
    println(testAppend(Cons(9, Cons(7, Cons(5, Nil()))), Cons(3, Cons(4, Cons(11, Nil())))))

  }
  def length[A](as: List[A]): Int = {
    @tailrec
    def loop(rem: List[A], agg: Int): Int = rem match {
      case Cons(_, tail) => loop(tail, agg + 1)
      case Nil()         => agg
    }

    loop(as, 0)
  }

  /* a) Напишите функцию которая записывает в обратном порядке список:
   *        def reverse[A](list: List[A]): List[A]
   */



  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testReverse[A](list: List[A]): List[A] = {
    def loop(rem: List[A], reverce: List[A]): List[A] = rem match {
      case Cons(head, tail) => loop(tail, Cons(head, reverce))
      case Nil() => reverce
    }
    loop(list, Nil())
  }

  /* b) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def map[A, B](list: List[A])(f: A => B): List[B]
   */



  // используйте функцию из пункта  (b) здесь, не изменяйте сигнатуру
  def testMap[A, B](list: List[A], f: A => B): List[B] = {
    def loop(rem: List[A], reverce: List[B]): List[B] = rem match {
      case Cons(head, tail) => loop(tail, Cons(f(head), reverce))
      case Nil() => reverce
    }
    testReverse(loop(list, Nil()))
  }
  
  /* c) Напишите функцию, которая присоединяет один список к другому:
   *        def append[A](l: List[A], r: List[A]): List[A]
   */



  // используйте функцию из пункта  (c) здесь, не изменяйте сигнатуру
  def testAppend[A](l: List[A], r: List[A]): List[A] = {
    def loop(rem: List[A], reverce: List[A], itog: List[A]): List[A] = reverce match {
      case Cons(head, tail) => loop(rem, Nil(), reverce)
      case Nil() => rem match {
        case Cons(head, tail) =>loop(tail, Nil(), Cons(head, itog))
        case Nil() => itog
      }
    }
    loop(testReverse(l), r, Nil())
  }


  /* d) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]
   * 
   *    она получает функцию, которая создает новый List[B] для каждого элемента типа A в 
   *    списке. Поэтому вы создаете List[List[B]]. 
   */



  // используйте функцию из пункта  (d) здесь, не изменяйте сигнатуру
  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[B] = {
    def loop(rem: List[A], reverce: List[B]): List[B] = rem match {
      case Cons(head, tail) => loop(tail, testAppend(f(head), reverce))
      case Nil() => reverce
    }
    testReverse(loop(list, Nil()))
  }

  /* e) Вопрос: Возможно ли написать функцию с хвостовой рекурсией для `Tree`s? Если нет, почему? */
}
