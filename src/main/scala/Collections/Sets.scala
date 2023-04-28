package Collections

object Sets extends App {
  val set1: Set[Int] = Set(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  val set2 = Set(11, 22, 1, 33, 44, 55, 66, 77, 88, 99)
  var set3: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(10, 20, 30, 40, 50, 60, 70, 80, 90)
  println(set1 + 10 + 20 + 30) // just add 10,20,30 as elements to the set
  println(set2)
  println(set3)
  println(set3.min)
  println(set3.max)
  println(set1 ++ set2) // concatenate
  println(set1.++(set2)) // concatenate
  println(set1.&(set2)) // intersection
  println(set1.intersect(set2)) // intersection
  var set0 = set1 ++ set2
  println(set0)
}
