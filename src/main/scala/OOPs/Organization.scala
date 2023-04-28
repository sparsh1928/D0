package OOPs

object Organization extends App {
  val emp1 = new Employee(101, "Sparsh")
  println(emp1.empName)
  val emp2 = new Employee( "Sparsh")
  println(emp2.empName)
  val emp3 = new Employee()
  println(emp3.empName)
  val emp4 = new Employee(105, "Sparsh")
  emp4.personalInformation("sparsharora1999@gmail.com")
  println(emp4.empName)
}

class Employee(empID: Int, val empName: String){
  def this(empName: String) = this(0, empName)

  def this() = this("")

  // methods

  def personalInformation(empMail: String) = {
    println(s"Emp ID: $empID EmpName: $empName Emp E-Mail: $empMail")
  }
}