package euler.lib

object Primes {
  def factorize(n: BigInt): List[BigInt] =
    LazyList.from(2)
      .map(BigInt(_))
      .takeWhile(k => k * k <= n)
      .find(n % _ == 0)
      .fold(List(n))(k => k :: factorize(n / k))

  def getPrimeStream(): LazyList[BigInt] = {
    def sieve(primes: LazyList[BigInt])(k: BigInt) =
      primes
        .takeWhile(p => p * p <= k)
        .forall(k % _ != 0)

    lazy val primes: LazyList[BigInt] =
      2 #::
        LazyList.from(3, 2)
          .map(BigInt(_))
          .filter(sieve(primes))
    primes
  }
}
