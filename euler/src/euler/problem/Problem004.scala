package euler.problem

object Problem004 {
  private def powUpTo(base: Int, digits: Int) =
    LazyList.fill(digits - 1)(base).product

  private def getDigitBounds(digits: Int) = {
    val min = powUpTo(10, digits)
    val max = powUpTo(10, digits + 1) - 1
    (min, max)
  }

  private def isPalindrome(n: Int) =
    n.toString == n.toString.reverse

  private def getMaxPalindromeProduct(digits: Int) = {
    val (min, max) = getDigitBounds(digits)

    LazyList.from(min)
      .takeWhile(_ <= max)
      .flatMap(k => (k to max).map(_ * k))
      .filter(isPalindrome)
      .max
  }

  def main(args: Array[String]): Unit = {
    val digits = 3
    val maxProduct = getMaxPalindromeProduct(digits)

    println(
      s"The largest palindrome made from product of two $digits-digit numbers is: $maxProduct"
    )
  }
}
