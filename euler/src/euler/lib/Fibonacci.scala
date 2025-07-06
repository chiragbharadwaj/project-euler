package euler.lib

object Fibonacci {
  def getFibonacciStream(): LazyList[BigInt] = {
    lazy val fibs: LazyList[BigInt] =
      0 #::
        fibs.scan(BigInt(1))(_ + _)
    fibs
  }
}
