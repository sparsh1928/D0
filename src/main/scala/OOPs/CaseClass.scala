package OOPs

object CaseClass extends App{
  // 1) Case class declaration
  case class Employee(empName: String, empID: Int)

  val developer = new Employee("Sparsh", 100)
  println(developer.empName)

  // 2) Equals, hashcode and toString

  val tester = new Employee("Jignesh", 101)
  println(tester.toString)
  println(tester) // shows the same output bcz calling toString method explicitly isn't mandatory

  val developer1 = new Employee("Sparsh", 100)
  println(developer == developer1)

  // 3) Companion Objects

  val analyst = Employee("Manoj", 102)
  println(analyst)

  val cloudEngineer = Employee.apply("Nick", 103)
  println(cloudEngineer)

  // 4) Case Object (no companion objects)

  case object Person {
    def getPersonalDetails = "My name is Sparsh."
  }
  println(Person.getPersonalDetails)
}
