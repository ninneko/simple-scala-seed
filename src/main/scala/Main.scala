import scala.annotation._
import scala.collection.{mutable => mc}
import scala.collection.JavaConverters._
import scala.math._

object Main {
  val sc = new java.util.Scanner(System.in)

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    val N = sc.nextInt()
    val s = Array.fill(N, 2)(sc.nextInt())
    solve(N, s)
  }

  def solve(n: Int, array: Array[Array[Int]]): Unit = {
    for (i <- 0 until n) {
      println(n)
    }

    array.foreach(_.foreach{ i =>
      println(i)
    })
  }
}