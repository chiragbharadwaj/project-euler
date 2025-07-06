package euler.problem

object Problem003 {
  private def getPrimeFactors(n: Long): List[Long] =
    LazyList.from(2)
      .map(_.toLong)
      .takeWhile(_ <= math.sqrt(n).toLong)
      .find(n % _ == 0L)
      .fold(List(n))(k => k :: getPrimeFactors(n / k))

  def main(args: Array[String]): Unit = {
    val n = 600_851_475_143L
    val factors = getPrimeFactors(n)
    val max = factors.max

    println(s"$max")
  }
}
