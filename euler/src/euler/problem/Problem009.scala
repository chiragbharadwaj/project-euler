package euler.problem

import euler.lib.Pythagorean

object Problem009 {
  def main(args: Array[String]): Unit = {
    val prod =
      Pythagorean.getTripletStream()
        .find(_.sum == 1_000)
        .map(_.product)
        .getOrElse(0)

    println(s"$prod")
  }
}
