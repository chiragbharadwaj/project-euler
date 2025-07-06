package euler.problem

object Problem005 {
  private def gcd(a: Long, b: Long): Long =
    if (b == 0L) a else gcd(b, a % b)

  private def lcm(a: Long, b: Long): Long =
    (a * b) / gcd(a, b)

  def main(args: Array[String]): Unit = {
    val smallest =
      LazyList.from(1)
        .map(_.toLong)
        .takeWhile(_ <= 20L)
        .reduce(lcm)

    println(s"$smallest")
  }
}
