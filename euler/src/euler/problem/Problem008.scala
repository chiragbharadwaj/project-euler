package euler.problem

import scala.io.Source

object Problem008 {
  private def getGreatestProduct(str: String, block: Int) =
    str
      .replaceAll("\\n", "")
      .split("")
      .map(_.toLong)
      .sliding(block, 1)
      .map(_.product)
      .max

  def main(args: Array[String]): Unit = {
    val file = "problem-008.txt"
    val str = Source.fromResource(file).getLines().mkString("\n")
    val block = 13

    val greatestProduct = getGreatestProduct(str, block)

    println(s"The greatest product of $block consecutive digits is: $greatestProduct")
  }
}
