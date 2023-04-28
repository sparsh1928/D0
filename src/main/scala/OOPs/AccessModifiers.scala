package OOPs

class Car{
  private var carName = "Volkwagen Polo"

  def display() = {
    println(carName)
  }
}

class Bike {
  protected var bikeName = "Bajaj Pulsar"
}

class NewBike extends Bike{
  def display() = {
    println(bikeName)
  }
}

class Scooty{
  var scootyName = "TVS Jupiter"

  def display() = {
    println(scootyName)
  }
}
object AccessModifiers extends App {
  val obj1 = new Car()
  obj1.display()
  val obj2 = new NewBike()
  obj2.display()
  val obj3 = new Scooty();
  obj3.display()
  obj3.scootyName = "TVS Ntorq"
  obj3.display()
}
