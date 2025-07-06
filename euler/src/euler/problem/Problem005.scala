package euler.problem

import euler.lib.Numbers

object Problem005 {
  def main(args: Array[String]): Unit = {
    val smallest =
      LazyList.from(1)
        .map(BigInt(_))
        .takeWhile(_ <= 20)
        .reduce(Numbers.lcm)

    println(s"$smallest")
  }
}
