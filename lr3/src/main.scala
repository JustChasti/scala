import RecursiveData._
import RecursiveFunctions._

object e{
  def testListIntHea1d(list: Int): String = {
    list.toString()
  }

  def main(args: Array[String]): Unit = {
    println(testAppend(Cons(9, Cons(7, Cons(5, Nil()))), Cons(3, Cons(4, Cons(11, Nil())))))
    println(testReverse(Cons(9, Cons(7, Cons(5, Nil())))))
    println(testMap(Cons(9, Cons(7, Cons(5, Nil()))), testListIntHea1d))
    println(testListIntEmpty(Cons(9, Cons(7, Cons(5, Nil())))))
    println(testListIntHead(Cons(9, Cons(7, Cons(5, Nil())))))
  }
}