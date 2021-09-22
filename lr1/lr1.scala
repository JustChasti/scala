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
    println(T14C("Hello")) 
}


def T14C(s2: String): Long = { 
    s2.foldLeft(1L)((m, n) => m * n) 
}


def Task16(){
    println(Compose("Hello"))
}


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
}*/


def valid(toString: String): Boolean = {
    var a = ListBuffer[Int]()
    for (w <- 0 until toString.length) {
      if (!a.contains(toString(w))) {
        a += toString(w)
      }
      else {
        return false
      }
    }
    true
}



def Task18(m: Int, n: Int){
    var a: Int = 0
    for (w <- m to n; if (valid(w.toString))) {
        a += w;
    }
    println(a)
}


def Task19(m: List[Any]){
    var s = 1::Nil
    s = s.filter(_<2)
    val s2 = m.toString();
    for(v<-0 until s2.length){
      if(s2(v).toInt>47&&s2(v).toInt<58){
        s = s2(v).toString.toInt::s
      }
    }
    println(s.reverse)
}



def Task20(n: Int){
    var a:Int = 1
    for (i <- 2 until n) {
      if (n % i == 0) {
        a=i;
      }
    }
    var c = 0
    for (w <- 0 until a.toString.length) {
      c+=a.toString.charAt(w).toString.toInt
    }
    println(c)
}


def Task21(k:Int, m: List[Any]){
    var c = List[Any]()
    for(i<- 0 until m.length){
      for(j<- 0 until k){
        c = m(i)::c
      }
    }
    println(c)
}


def Task22(n: Int){
    var a:Int = 1
    for (i <- 2 until n) {
      if (n % i == 0) {
        a=i;
      }
    }
    var c = 0
    for (w <- 0 until a.toString.length) {
      c+=a.toString.charAt(w).toString.toInt
    }
    println(c)
}


def Task23(k:Int, m: List[Any]){
    var c = List[Any]()
    for(i<- 0 until m.length){
      for(j<- 0 until k){
        c = m(i)::c
      }
    }
    println(c)
}


def gcd(a: Int, b: Int): Int = {
    if(b == 0){
      a
    }
    else {
      gcd(b,a % b);
    }
}


def Task24(n: Int, m: Int){
    println(n / gcd(n, m) * m)
}


def Task25(k:Int, m: List[Any]){
    var c = List[Any]()
    for(i<- 0 until m.length){
      if((i+1)%k != 0){
        c = m(i)::c
      }
    }
    println(c.reverse)
}


def faktorial(n:Int):Int={
    if(n<2){
      1
    }
    else {
      n*faktorial(n-1)
    }
}


def Task26(n: Int, k: Int){
    println(faktorial(n)/faktorial(n-k))
}


def Task27(k:Int, m: List[Any]) : List[Any]={
    var c = List[Any]()
    var i = k
    if(i>0){
      for(i<- 1 until m.length){
        c = m(i)::c
      }
      c = c.reverse
      val b = m(0)
      c = c:+b
      i -= 1
    }
    else {
      for(i<- 0 until m.length-1){
        c = m(i)::c
      }
      c = c.reverse
      val a = m(m.length-1)
      c = a::c
      i += 1
    }
    if(i!=0){
      return Task27(i, c)
    }
    c
}


def summdel(n: Int): Int = {
    var c = 1
    for(v <- 2 until n){
      if(n%v==0)
        c+=v
    }
    c
}


def Task28(n: Int): Int ={
    for(v <- 0 to n-1){
      if(n-v==summdel(n-v))
        return n-v
    }
    0
}


def Task29(m: List[Any]){
    var c1 = List[Any]()
    var c2 = List[Any]()
    for(i<- 0 until m.length){
      if(i%2 == 0){
        c1 = m(i)::c1
      }
      else {
        c2 = m(i)::c2
      }
    }
    println(c1.reverse)
    println(c2.reverse)
}


def Task30(n: Int): Int = {
    var count = 1
    var sum = 0
    for(i<-n to 1 by -1){
      var a = i
      while (a>0){
        sum+=a%10
        a/=10
      }
      if(sum>1){
        val b = sum
        while (sum<i){
          sum*= b
          count+=1
        }
      }
      if(sum == i && count !=1 )return sum
      sum=0
    }
    0
}


def Task31(m: List[(Int, String)]){
    var c1 = List[Int]()
    var c2 = List[String]()
    for(i<- 0 until m.length){
      c1 = m(i)._1::c1
      c2 = m(i)._2::c2
    }
    println(c1.reverse)
    println(c2.reverse)
}

