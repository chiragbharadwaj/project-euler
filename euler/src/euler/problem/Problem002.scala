package euler.problem

object Problem002 {
  def main(args: Array[String]): Unit = {
    lazy val fibs: LazyList[Int] = 0 #:: fibs.scan(1)(_ + _)

    val sum =
      fibs.takeWhile(_ < 4_000_000)
        .filter(_ % 2 == 0)
        .sum

    println(s"$sum")
  }
}
