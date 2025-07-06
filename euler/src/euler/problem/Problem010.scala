package euler.problem

import euler.lib.Primes

object Problem010 {
  def main(args: Array[String]): Unit = {
    val sum =
      Primes.getPrimeStream()
        .takeWhile(_ < 2_000_000)
        .sum

    println(s"$sum")
  }
}
