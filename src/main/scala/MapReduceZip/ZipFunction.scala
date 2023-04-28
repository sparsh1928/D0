package MapReduceZip

object ZipFunction extends App {
  // zip aggregates the contents of two lists into one single list of pairs

  val list1 = List(14,16,19,28,31)
  val list2 = List('J', 'R', 'P', 'S', 'A')
  val list3 = list1.zip(list2)
  val list4 = list2.zip(list1)
  println(list3)
  println(list4)
}
