package euler.problem

object Problem001 {
  def main(args: Array[String]): Unit = {
    val sum =
      LazyList.from(1)
        .takeWhile(_ < 1_000)
        .filter(k => k % 3 == 0 || k % 5 == 0)
        .sum

    println(s"$sum")
  }
}
