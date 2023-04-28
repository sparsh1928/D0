package OOPs

object RandomOrganization extends App {
  // Companions:- You can declare an object and a class with the same name in the same scope
  object Employee {
    val Employee_Role = "ADMIN"
    def personalInformation(empID: Int, empName: String) = {
      println(s"Emp ID: $empID EmpName: $empName")
    }

    def apply(empName: String) = println(s"from apply function $empName")
  }

  class Employee(empID: Int, empName: String){
    def salDetails() = {
      println("Salary Details -> 250000")
    }
  }
  val employeeObj = new Employee(128, "Sparsh")
  println(Employee.Employee_Role)
  println(Employee.personalInformation(110, "Sparsh"))
  println(employeeObj.salDetails())

  val employeeOnlyObj1 = Employee
  val employeeOnlyObj2 = Employee
  println(employeeOnlyObj1 == employeeOnlyObj2)
  val employeeObj2 = new Employee(128, "Sparsh")
  println(employeeObj == employeeObj2)
  // objects are completely singleton in scala

  // Most Important:- the apply() function is invoked everytime the object is called
  employeeOnlyObj1.apply("Sparsh")
  employeeOnlyObj1("Sparsh")
}
