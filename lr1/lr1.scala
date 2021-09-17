import scala.math.pow

import scala.math.BigInt.probablePrime
import scala.util.Random

import scala.collection.mutable.ListBuffer
import scala.collection.IterableOnce


def Task4(){
    val P = BigInt(2).pow(1024)
    println(P)
}


def Task5(){
    println(probablePrime(100, Random)) // 3 и 4 строчки
}


def Task6(){
    val name = probablePrime(100, Random)
    println(name.toString(36))
}


def Task7(){
    val text = "text123"
    println(text.charAt(0))
    println(text.charAt(text.length() - 1))
}


def Task8(){
    val text = "text123"
    println(text.take(3)) // A string containing the first n chars of this string.
    println(text.drop(3)) // The rest of the string without its n first chars.
    // Right то же но с конца
}


def Task9(x: Double): Int = {
    var signum = 0
    if (x > 0)
        signum = 1
    else if (x < 0)
        signum = -1
    signum
}


def Task10(){
    val x = {}
    println(x.getClass)
}


def Task11(){
    for (i <- 10 to 0 by -1)
       println(i)
}


def Task12(){
    val n = 7
    countdown(n)
}


def countdown (n: Int){
    for (i <- n to 0 by -1)
       println(i)
}


def Task13(){
    val text = "Hello"
    var uni = 1L
    for (i <- 0 to text.length() - 1)
        uni = uni * text.codePointAt(i)
    println(uni)
}


def Task14(){
    println(Compose("Hello"))
}


// Task 16 основан на 15, 15 - нет


def Compose(text: String): Long = {
    var uni: Long = text.codePointAt(0)
    if (text.length() != 1)
        uni = uni * Compose(text.drop(1))
    uni
}


/*
def Task17(n: Double): Double = {
    var x: Double = 1
    if (n > 0 && n % 2 == 0)
        n = 
    else if (n > 0 && n % 2 != 0)
        println(0)
    else if (n == 0)
        x = 1
    else
        x = n
}*/


def Task19(){
    var l = List(0,List(1,2),List(3,List(5,6)), 7 ,8)
    println(Opener(l))
}


def Opener(l: List[Any]): Unit = {
    var result = ListBuffer[Any]()
    var flag = false
    var s = ListBuffer.empty ++= l
    while (flag == false){
        flag = true
        var sS = ListBuffer.empty ++= s
        var newS = ListBuffer.empty ++= s
        for (i <- 0 to s.length - 1){
            println(s.length, "len")
            if (s(i).getClass.getName == "java.lang.Integer"){
                result += s(i)
                var temp = sS(i)
                newS -= temp
            }
            else{
                flag = false
                println(newS)
            }
        }
        println(newS, "final")
        flag = true
        println(newS.toList.flatten)
    }
    result
}


Task19()
