package euler.problem

object Problem009 {
  def generatePythagoreanTriplets() =
    for {
      c <- LazyList.from(1)
      b <- 1 until c
      a <- 1 until b
      if a * a + b * b == c * c
    } yield (a, b, c)

  def main(args: Array[String]): Unit = {
    val sum = 1_000

    val triplets = generatePythagoreanTriplets()
    val product =
      triplets
        .find { case (a, b, c) => a + b + c == sum }
        .map { case (a, b, c) => a * b * c }
        .getOrElse(0)

    println(s"The product of the Pythagorean triplet for which a + b + c = $sum is: $product")
  }
}
