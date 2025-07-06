package euler.problem

object Problem009 {
  def main(args: Array[String]): Unit = {
    val triplets =
      for {
        c <- LazyList.from(1)
        b <- 1 until c
        a <- 1 until b
        if a * a + b * b == c * c
      } yield (a, b, c)

    val prod =
      triplets
        .find { case (a, b, c) => a + b + c == 1_000 }
        .map { case (a, b, c) => a * b * c }
        .getOrElse(0)

    println(s"$prod")
  }
}
