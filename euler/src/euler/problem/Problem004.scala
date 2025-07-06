package euler.problem

object Problem004 {
  private def pow(base: Int, exp: Int) =
    LazyList.fill(exp)(base).product

  private def getDigitBounds(digits: Int) = {
    val min = pow(10, digits - 1)
    val max = pow(10, digits) - 1
    (min, max)
  }

  private def getSubStream(max: Long)(k: Int) =
    LazyList.from(k).takeWhile(_ <= max).map(_ * k)

  private def isPalindrome(n: Int) =
    n.toString == n.toString.reverse

  private def getMaxPalindromeProduct(digits: Int) = {
    val (min, max) = getDigitBounds(digits)

    LazyList.from(min)
      .takeWhile(_ <= max)
      .flatMap(getSubStream(max))
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
