package basics

object FunctionDefinitions extends App {
  // 1) Without Parameters

  def greetings() = println("Hello Everyone, Greetings!")

  greetings()
  // 2) With Parameters

  def addition(a: Int, b: Int): Int = return a+b

  println(addition(a = 28,b = 14))
  // 3) Nested Functions

  def greetings2: String = {
    def specialGreetings: String ={
      "Have a great day!"
    }
    "Greetings, ".concat(specialGreetings)
  }
    println(greetings2)
}
