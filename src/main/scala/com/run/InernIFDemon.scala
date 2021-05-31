package scala.com.run

import scala.io.StdIn

object InernIFDemon {
  def main(args: Array[String]): Unit = {
    println("input score and sex ")
    val score = StdIn.readDouble()
    val sex = StdIn.readLine()

    if (score < 8.0){
      if (sex.equals("nan")){
        println("male ++")
      }
      else {
        println("female ++")
      }
    }else{
      println("......")
    }

  }
}
