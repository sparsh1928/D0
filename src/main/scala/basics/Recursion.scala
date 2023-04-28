package basics

object Recursion extends App{

  def greet1() = {
    "This is basic example of call stack."
  }

  def greet2() = {
    greet1()
  }

  def greet3() = {
    println(greet2())
  }

  greet3
  //recursion uses call stack:- the instructions are pushed into the stack at once and then are computed in the end, this causes stack overflow error from large computations
  def factorial(num: Int): Int = {
    if (num <=1 ) 1

    else num * factorial(num-1)
  }

  //println(factorial(num = 15000))

  //using tail recursion:- in tail recursion, the instructions are computed side by side
  // BigInt  -2Integer.MAX_VALUE (exclusive) to +2Integer.MAX_VALUE
  def factNew(num: Int, acc: BigInt): BigInt = {
    if (num <= 1) acc

    else factNew(num-1, acc * num)
  }
  println(factNew(15000, 1))

  def fibo(count: Int, first: Int, second: Int): Int = {
    if (count==0) first
    if (count==1) second
    else {
      fibo(count-1, second, first+second)
    }
  }
  println(fibo(15, 0, 1))
}
