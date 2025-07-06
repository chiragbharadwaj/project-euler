package euler.problem

import euler.lib.Primes

object Problem007 {
  def main(args: Array[String]): Unit = {
    val nthPrime =
      Primes.getPrimeStream()
        .drop(10_000)
        .head

    println(s"$nthPrime")
  }
}
