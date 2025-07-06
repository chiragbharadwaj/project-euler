package euler.lib

object Pythagorean {
  case class Triplet(a: BigInt, b: BigInt, c: BigInt) {
    def sum: BigInt = a + b + c
    def product: BigInt = a * b * c
  }

  def getTripletStream(): LazyList[Triplet] =
    for {
      c <- LazyList.from(1)
      b <- 1 until c
      a <- 1 until b
      if a * a + b * b == c * c
    } yield Triplet(a, b, c)
}
