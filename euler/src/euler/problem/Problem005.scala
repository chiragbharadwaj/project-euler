package euler.problem

object Problem005 {
  private def gcd(a: Long, b: Long): Long =
    if (b == 0L) a else gcd(b, a % b)

  private def lcm(a: Long, b: Long): Long =
    (a * b) / gcd(a, b)

  private def getSmallestEvenlyDivisible(n: Long) =
    LazyList.from(1)
      .map(_.toLong)
      .takeWhile(_ <= n)
      .reduce(lcm)

  def main(args: Array[String]): Unit = {
    val limit = 20L
    val smallest = getSmallestEvenlyDivisible(limit)

    println(
      s"The smallest number that is evenly divisible by all numbers from 1 to $limit is: $smallest"
    )
  }
}
