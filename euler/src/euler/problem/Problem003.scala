package euler.problem

import euler.lib.Primes

object Problem003 {
  def main(args: Array[String]): Unit = {
    val n = 600_851_475_143L
    val max = Primes.factorize(n).max

    println(s"$max")
  }
}
