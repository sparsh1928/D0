package basics

object VariableValueTypes extends App{

  //before 2.9.3
  //def main(args: Array[String]): Unit = {
   // println("Hello")
  //}

  //after 2.9.3 just add extends app after object name
  //println("Hello")

  //val/var variable_name: datatype = value;

  val number: Int = 10
  println(number)

  val number1 = 100 // this works fine too bcz the scala compiler will check the RHS value and determine what should be the return type of variable
  println(number1)

  val fNumber = 2.5     // here datatype of fNumber is said double by compiler
  val fNumber1 = 2.5575f   // in order to assign float datatype we must add f after the value

  // same goes with long we need to add 'L' after the value to make the compiler take the value as long

  //number = 25 this throws error bcz values that are declared using val cannot be reassigned a value

  //in order to reassign values the variable should be declared using var keyword

  var num = 19
  num = 28
  println(num)
}


