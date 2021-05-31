package scala.com.run

import scala.io.StdIn

object InputDemo {
  def main(args: Array[String]): Unit = {
    println("input name ")
    val name = StdIn.readLine()
    println("name = " + name)

    println("input age")
    val age = StdIn.readInt()
    println("age = " + age)

    println("input salary")
    val sal = StdIn.readDouble()
    println("sal = " + sal)

  }
}
