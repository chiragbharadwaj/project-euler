package euler.problem

object Problem004 {
  private def isPalindrome(n: Int) =
    n.toString == n.toString.reverse

  private def getMaxPalindromeProduct(numDigits: Int) = {
    val min = Math.pow(10, numDigits - 1).toInt
    val max = Math.pow(10, numDigits).toInt - 1

    (min to max).view
      .flatMap(k => (k to max).map(_ * k))
      .filter(isPalindrome)
      .max
  }

  def main(args: Array[String]): Unit = {
    val numDigits = 3
    val maxProduct = getMaxPalindromeProduct(numDigits)

    println(
      s"The largest palindrome made from product of two $numDigits-digit numbers is: $maxProduct"
    )
  }
}
