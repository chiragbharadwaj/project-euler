package euler.problem

object Problem001 {
  private def isMultipleOfAny(factors: List[Int])(n: Int) =
    factors
      .map(n % _ == 0)
      .reduce(_ || _)

  private def getSumOfMultiples(factors: List[Int], limit: Int) =
    (1 until limit).view
      .filter(isMultipleOfAny(factors))
      .sum

  def main(args: Array[String]): Unit = {
    val factors = List(3, 5)
    val limit = 1_000

    val sum = getSumOfMultiples(factors, limit)

    println(s"The sum of all multiples of ${factors.mkString(", ")} below $limit is: $sum")
  }
}
