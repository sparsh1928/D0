package Collections

object Maps extends App {
  var employeeData = Map(101 -> "Sparsh", 102 -> "Preet", 103 -> "Mansi")
  val tuple = new Tuple2(3051, "Sparsh Arora")
  val tuple1 = new Tuple5(1,2,3,4,5)
  println(employeeData)
  println(employeeData(101))
  println(employeeData.keys)
  println(employeeData.values)
  println(employeeData.contains(101))
  println(tuple)
  println(tuple1._2) // ._ is used to access specific element of tuple
  tuple1.productIterator.foreach{ i => println("Value = " + i) }
}
