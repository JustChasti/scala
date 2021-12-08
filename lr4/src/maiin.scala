import Adts._
import Maps._
import Sequence._
import Strings._

object maiin{
  def main(args: Array[String]): Unit = {
   // println(testIsEven(1))
   // println(testUnderaged {Map("1" -> User("qwerty", 1), "2" -> User("qwert", 2), "3" -> User("qwer", 3), "4" -> User("qwe", 50))})
    println(testGroupUsers(Seq(User("qwerty", 1) , User("qwert", 2), User("qwer", 3), User("qwe", 4))))
   /* println(testLastElement(Seq(1,2)))
    println(testZip(Seq(1,2), Seq(3,4)))
    println(testForAll(Seq(1,2,3,4))( _ == 3))
    println(testPalindrom(Seq(1,2,3,4)))
    println(testFlatMap(Seq(1,2,3,4))(i => Seq(i + 1)))
    println(testUppercase("qwerty"))
    println(testInterpolations("kh", 19))
    println(testComputation(1,2))
    println(testTakeTwo("qwerty"))*/
  }
}