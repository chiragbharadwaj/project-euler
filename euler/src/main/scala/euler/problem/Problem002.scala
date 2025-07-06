package euler.problem

object Problem002 {
  private def getSumOfEvenFibonaccis(limit: Int) = {
    lazy val fibs: LazyList[Int] = 0 #:: fibs.scan(1)(_ + _)

    fibs.takeWhile(_ < limit)
      .filter(_ % 2 == 0)
      .sum
  }

  def main(args: Array[String]): Unit = {
    val limit = 4_000_000
    val sum = getSumOfEvenFibonaccis(limit)

    println(s"The sum of even-valued Fibonacci numbers below $limit is: $sum")
  }
}
