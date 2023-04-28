package basics

object DefaultAndNamedArguments extends App {
  // 1) default args
  def employeeDetails(empID: Int, empName: String, orgName: String = "ABC Ltd") = {
    println("Emp ID: " + empID + " Employee Name: " + empName + " Organization Name: " + orgName)
  }
  employeeDetails(100, "Sparsh Arora", "ABC1 Ltd")
  employeeDetails(101, "Preet Arora")

  // 2) named args

  def empDetails(orgName:String = "XYZ Ltd", empID: Int, empName: String) = {
    println("Emp ID: " + empID + " Employee Name: " + empName + " Organization Name: " + orgName)
  }

  empDetails(empID = 105, empName =  "Sparsh Arora", orgName =  "ABC1 Ltd")
  empDetails(empID = 106, empName = "Preet Arora")
}

