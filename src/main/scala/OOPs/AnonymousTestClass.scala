package OOPs

object AnonymousTestClass extends App {
  trait Speed {
    def speed(): String
  }
  val speedObj = new Speed {
    override def speed(): String = "Speed is 180 kmph."
  }
  println(speedObj.speed())
}
