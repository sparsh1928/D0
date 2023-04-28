package MapReduceZip

// reduce function is used to combine all the values of collection and return a single result post binary operation
object ReduceFucntion extends App {
  val list1 = List(14, 16, 18, 19, 28, 31, 52)
  val result = list1.reduce((x, y) => x max y)
  val result2 = list1.reduce(_ + _)
  println(result)
  println(result2)
}
/*
  var sum = 0
  val res = list1.map((i) => (i,1))
  val res2 = list1.reduce((x,y) => x + y)
  println(res)
  println(res2)
  val resNew = res.reduce((x,y) => )
}
*/
