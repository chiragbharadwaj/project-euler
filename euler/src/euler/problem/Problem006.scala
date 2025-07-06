package euler.problem

object Problem006 {
  def main(args: Array[String]): Unit = {
    val n = 100
    val diff = n * (n - 1) * (n + 1) * (3 * n + 2) / 12

    println(s"$diff")
  }
}
