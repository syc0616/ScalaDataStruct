package scala.com.run

object IfDemo {
  def main(args: Array[String]): Unit = {
    var year = 2020
    if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
      println("year = " + year + " is leap year")
    }else{
      println("year = " + year + " is not leap year")
    }
  }
}
