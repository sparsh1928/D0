package AnonymousFunction

object AnonFunc extends App {
  // 1)
  var anonymousFunction1 = (x: String, y: String) => (x+y)
  var anonymousFunction3 = (x: Int, y: Int) => (x*y)
  // 2)
  var anonymousFunction2 = (_: String) + (_: String)


  println(anonymousFunction1("Sparsh", " Arora"))
  println(anonymousFunction2("Mr. Sparsh", " Arora"))
  println(anonymousFunction3(2,4))
}
