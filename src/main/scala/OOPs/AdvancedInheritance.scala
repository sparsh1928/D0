package OOPs

object AdvancedInheritance extends App{
  // abstract(The Thing) vs traits(Behaviour)

  abstract class Bike {
    def fuelCapacity() = {
      "Bike fuel capacity is 15L."
    }
    def gearType(): String
  }
  // Traits => Interface

  trait Speed {
    def speed(): String
  }
  class Pulsar extends Bike with Speed{
    override def gearType(): String = "Gear type is 5 stroke."

    override def speed(): String = "Speed upto 180 kmph"
  }
  val pulsarBike = new Pulsar()
  println(pulsarBike.gearType())
  println(pulsarBike.fuelCapacity())
  println(pulsarBike.speed())







}
