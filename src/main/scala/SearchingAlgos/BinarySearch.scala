package SearchingAlgos

import scala.io.StdIn._
import scala.util.control.Breaks._
object BinarySearch extends App {

  def binSearch(num: Int, arrNum: Array[Int]) = {
    var flag = false
    var loc = 0
    var low = 0
    var high = arrNum.length - 1
      breakable{
        while(low<=high){
          var mid = (low + high) / 2
          if (arrNum(mid) == num) {
            flag = true
            loc = mid + 1
            break
          }
          else if (arrNum(mid) < num){
            low = mid + 1
          }
          else{
            high = mid - 1
          }
        }
      }
    if (flag == true){
      println("The value " + num + " was found at " + loc + "th location.")
    }
    else{
      println("The value " + num + " wasn't found.")
    }
  }
  var values: Array[Int] = new Array[Int](10)
  println("Enter the values in array: ")
  for (x <- 0 until 10) {
    values(x) = readInt()
  }
  print("Enter the value you want to search: ")
  var key = readInt()

  binSearch(key, values)
}
