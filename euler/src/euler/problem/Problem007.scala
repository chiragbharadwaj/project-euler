package euler.problem

object Problem007 {
  private def sieve(primes: LazyList[Int])(k: Int) =
    primes.takeWhile(p => p * p <= k).forall(k % _ != 0)

  private def generatePrimes() = {
    lazy val primes: LazyList[Int] =
      2 #:: LazyList.from(3, 2).filter(sieve(primes))
    primes
  }

  def main(args: Array[String]): Unit = {
    val primes = generatePrimes()
    val nth = primes.drop(10_000).head

    println(s"$nth")
  }
}
