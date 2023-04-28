package basics

import scala.io.StdIn.readInt

object RelationalOperators extends App {
  println("Enter 1st Value: ")
  var a = readInt();
  println("Enter 2nd Value: ")
  var b = readInt();

  // Equal to operator
  println("Equality of a == b is : " + (a == b));

  // Not equal to operator
  println("Not Equals of a != b is : " + (a != b));

  // Greater than operator
  println("Greater than of a > b is : " + (a > b));

  // Lesser than operator
  println("Lesser than of a < b is : " + (a < b));

  // Greater than equal to operator
  println("Greater than or Equal to of a >= b is : " + (a >= b));

  // Lesser than equal to operator
  println("Lesser than or Equal to of a <= b is : " + (a <= b));
}
