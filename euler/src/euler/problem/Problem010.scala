package euler.problem

object Problem010 {
  private def sieve(primes: LazyList[Long])(k: Long) =
    primes.takeWhile(p => p * p <= k).forall(k % _ != 0L)

  private def generatePrimes() = {
    lazy val primes: LazyList[Long] =
      2L #:: LazyList.from(3, 2).map(_.toLong).filter(sieve(primes))
    primes
  }

  def main(args: Array[String]): Unit = {
    val primes = generatePrimes()
    val sum = primes.takeWhile(_ < 2_000_000).sum

    println(s"$sum")
  }
}
