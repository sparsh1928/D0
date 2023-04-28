package SearchingAlgos

import scala.io.StdIn._
import scala.util.control.Breaks._

object LinearSearch extends App {

  def lSearch(num: Int, arrNum: Array[Int]) = {
    var flag = false
    var loc = 0
    breakable {
      for (i <- 0 until arrNum.length) {
        if (num == arrNum(i)) {
          loc = i+1
          flag = true
          break
        }
      }
    }
    if (flag == true){
      println("The value " + num +" is found at " + loc +"th position")
    }
    else{
      println(s"The value $num wasn't found.")
    }
  }

  var values: Array[Int] = new Array[Int](10)
  println("Enter the values in array: ")
  for (x <- 0 until 10){
    values(x) = readInt()
  }
  print("Enter the value you want to search: ")
  var key = readInt()
  lSearch(key, values)
}