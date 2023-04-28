package basics

import java.util.UUID

object CallByvalueAndName extends App {
  // 1) Value and Name

  def callbyvalue(a: Int, b: String) = {
    println("Value of a: " + a)
    println("Value of b: " + b)
    println("Value of b: " + b)
  }

  // => will basically add the exact expression used in the function call
  def callbyname(x: Int, y: => String) = {
    println("Value of x: " + x)
    println("Value of y: " + y)
    println("Value of y: " + y)
  }

  callbyvalue(100, UUID.randomUUID().toString)
  callbyname(1000, UUID.randomUUID().toString)
}
