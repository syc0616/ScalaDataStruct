package scala.com.run

object MultiIfDemon {
  def main(args: Array[String]): Unit = {
    val (a,b,c) = (3, 100, 6)
    var (x1, x2) = (0.0, 0.0)

    val m = b*b - 4*a*c

    if (m > 0){
      x1 = (-b + math.sqrt(m))/(2*a)
      x2 = (-b - math.sqrt(m))/(2*a)
    }else if (m == 0){
      x1 = (-b + math.sqrt(m))/(2*a)
      println("x1=" + x1.formatted("%.2f"))
    }
  }
}
