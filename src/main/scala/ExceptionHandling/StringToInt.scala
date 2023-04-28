package ExceptionHandling


object StringToInt extends App{
  def toInt(s: String): Option[Int] = {
    try{
      Some(Integer.parseInt(s.trim))
    }
    catch{
      case e: Exception => None
    }
  }

  println(toInt("235"))
  println(toInt("1"))
  println(toInt("0"))
  println(toInt(""))
  println(toInt("Sparsh"))
}
