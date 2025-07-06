package euler.problem

object Problem006 {
  private def squareOfSum(n: Int) =
    n * n * (n + 1) * (n + 1) / 4

  private def sumOfSquares(n: Int) =
    n * (n + 1) * (2 * n + 1) / 6

  private def getSquareDifference(n: Int) =
    squareOfSum(n) - sumOfSquares(n)

  def main(args: Array[String]): Unit = {
    val limit = 100
    val diff = getSquareDifference(limit)

    println(
      s"The difference between the sum of the squares and the square of the sum of the first $limit natural numbers is: $diff"
    )
  }
}
