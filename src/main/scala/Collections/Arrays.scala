package Collections

import scala.Array.ofDim
import scala.io.StdIn.readInt

object Arrays extends App{
  var newArray =  Array(5,10,15,19,28,31)
  var total = 0
  println(newArray)
  for(i <- newArray)
      println(i)
  for(i <- newArray)
    total += i
  println("Sum of all elements is: " + total)
  println("number of elements: " + newArray.length)

  var multiDimArray = ofDim[Int](3,3)
  print("Enter the values: ")
  for (i <- 0 until 3) {
    for (j <- 0 until 3) {
      multiDimArray(i)(j) = readInt()
    }
  }
  for (i <- 0 until 3) {
    for (j <- 0 until 3) {
      print(multiDimArray(i)(j) + " ")
    }
    println()
  }
}

