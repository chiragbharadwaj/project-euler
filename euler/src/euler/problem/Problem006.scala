package euler.problem

object Problem006 {
  def main(args: Array[String]): Unit = {
    val n = 100L
    val diff = n * (n - 1L) * (n + 1L) * (3L * n + 2L) / 12L

    println(s"$diff")
  }
}
