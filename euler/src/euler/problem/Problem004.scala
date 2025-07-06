package euler.problem

import euler.lib.Numbers

object Problem004 {
  def main(args: Array[String]): Unit = {
    val prod =
      LazyList.from(100)
        .takeWhile(_ <= 999)
        .flatMap(k => LazyList.from(k).takeWhile(_ <= 999).map(_ * k))
        .filter(Numbers.isPalindrome)
        .max

    println(s"$prod")
  }
}
