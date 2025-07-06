package euler.problem

import euler.lib.Fibonacci

object Problem002 {
  def main(args: Array[String]): Unit = {
    val sum =
      Fibonacci.getFibonacciStream()
        .takeWhile(_ < 4_000_000)
        .filter(_ % 2 == 0)
        .sum

    println(s"$sum")
  }
}
