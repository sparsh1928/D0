package basics

object StringInterpolators extends App {
  // 1) String
  val empName = "Sparsh"
  val empID = 100
  val orgName = "ABC Ltd"
  val sal = 28000
  val bonusPercentage = 1.5678
  println(s"Emp ID: $empID Emp Name: $empName Organization Name: $orgName Emp Salary: ${sal * 2}")
  // 2) F
  println(f"Emp ID: $empID Emp Name: $empName Organization Name: $orgName Emp Salary: ${sal * 2} Bonus Percentage: $bonusPercentage%2.2f")
  // 3) Raw
  println(raw"Hello \n This is the use of raw interpolator")
}
