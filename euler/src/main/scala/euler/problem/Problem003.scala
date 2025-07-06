package euler.problem

object Problem003 {
  private def getPrimeFactors(n: Long): List[Long] =
    (2L to math.sqrt(n).toLong)
      .find(n % _ == 0L)
      .fold(List(n))(k => k :: getPrimeFactors(n / k))

  def main(args: Array[String]): Unit = {
    val number = 600_851_475_143L

    val primeFactors = getPrimeFactors(number)
    val largestPrimeFactor = primeFactors.max

    println(s"The largest prime factor of $number is: $largestPrimeFactor")
  }
}
