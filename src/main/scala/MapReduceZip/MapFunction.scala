package MapReduceZip

object MapFunction extends App {
  // Map function iterates over the elements of a list and evaluates the function provided and the resulted list is returned

  val list1 = List(14,16,19,28,31)
  println(list1.map(_ * 2))     // this is anonymous function
  println(list1.map((i: Int) => (i * 2)))
  
  // Flatten function is used to combine nested lists

  val listMain = List(List(1,2,3,4,5), List(6,7,8,9,10))
  println(listMain)
  val listAfterFlatten = listMain.flatten
  println(listAfterFlatten)

  // flatMap is a function with combined functionality of flatten and map functions

  val listForFlatMap = List(List(5,10,15,20,25), List(30,35,40,45,50), List(55,60,65,70,75), List(80,85,90,95,100))
  val finalList = listForFlatMap.flatMap( i => i.map(_ * 10))
  println(listForFlatMap)
  println(finalList)
}
