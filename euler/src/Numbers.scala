package euler.lib

object Numbers {
  def gcd(a: BigInt, b: BigInt): BigInt =
    if (b == 0) a else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt =
    (a * b) / gcd(a, b)

  def isPalindrome(n: BigInt) =
    n.toString == n.toString.reverse
}
