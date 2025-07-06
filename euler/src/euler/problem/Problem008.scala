package euler.problem

import scala.io.Source

object Problem008 {
  def main(args: Array[String]): Unit = {
    val prod =
      Source.fromResource("problem-008.txt")
        .getLines()
        .mkString("\n")
        .replaceAll("\\n", "")
        .split("")
        .map(_.toLong)
        .sliding(13, 1)
        .map(_.product)
        .max

    println(s"$prod")
  }
}
