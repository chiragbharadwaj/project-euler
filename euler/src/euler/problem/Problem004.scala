package euler.problem

object Problem004 {
  private def isPalindrome(n: Int) =
    n.toString == n.toString.reverse

  def main(args: Array[String]): Unit = {
    val prod =
      LazyList.from(100)
        .takeWhile(_ <= 999)
        .flatMap(k => LazyList.from(k).takeWhile(_ <= 999).map(_ * k))
        .filter(isPalindrome)
        .max

    println(s"$prod")
  }
}
