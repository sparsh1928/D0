package basics

import scala.io.StdIn.readInt

object BasicOperators extends App{
  println("Enter 1st Value: ")
  var a = readInt();
  println("Enter 2nd Value: ")
  var b = readInt();

  // Addition
  println("Addition of a + b = " + (a + b));

  // Subtraction
  println("Subtraction of a - b = " + (a - b));

  // Multiplication
  println("Multiplication of a * b = " + (a * b));

  // Division
  println("Division of a / b = " + (a / b));

  // Basic Operator + Assignment

  var c = 28
  var d = 95
  d += c
  println("Value of D after addition and assignment: " + d)
}
