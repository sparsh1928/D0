package Collections

object Lists extends App {
  var list1 = List(1,2,3,4,5)
  var list2 = List(6,7,8,9,10)
  var list3 = List(11,12,13,14,15)
  var list4 = List()
  println(list1.concat(list2.concat(list3)))
  println(list4.isEmpty)
  println(list1.head)
  println(list1.tail)
}
