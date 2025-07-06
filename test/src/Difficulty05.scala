package test

import euler.lib.Fibonacci
import euler.lib.Numbers
import euler.lib.Primes
import euler.lib.Pythagorean

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._
import scala.io.Source

class Difficulty05 extends AnyFlatSpec {
  "Problem 010" should "find the sum of all prime numbers under 2 million" in {
    val sum =
      Primes.getPrimeStream()
        .takeWhile(_ < 2_000_000)
        .sum

    sum shouldEqual 142913828922L
  }

  "Problem 009" should "find the product of numbers in the sole Pythagorean triplet that adds to 1000" in {
    val prod =
      Pythagorean.getTripletStream()
        .find(_.sum == 1_000)
        .map(_.product)
        .getOrElse(0)

    prod shouldEqual 31875000
  }

  "Problem 008" should "find the largest product of 13 consecutive digits in a 1000-digit number" in {
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

    prod shouldEqual 23514624000L
  }

  "Problem 007" should "find the 10001th prime number" in {
    val nthPrime =
      Primes.getPrimeStream()
        .drop(10_000)
        .head

    nthPrime shouldEqual 104743
  }

  "Problem 006" should "find the difference between the sum of squares and square of sum of the first 100 natural numbers" in {
    val n = 100
    val diff = n * (n - 1) * (n + 1) * (3 * n + 2) / 12

    diff shouldEqual 25164150
  }

  "Problem 005" should "find the smallest number evenly divisible by all of {1, ..., 20}" in {
    val smallest =
      LazyList.from(1)
        .map(BigInt(_))
        .takeWhile(_ <= 20)
        .reduce(Numbers.lcm)

    smallest shouldEqual 232792560
  }

  "Problem 004" should "find the largest palindome product of two 3-digit numbers" in {
    val prod =
      LazyList.from(100)
        .takeWhile(_ <= 999)
        .flatMap(k => LazyList.from(k).takeWhile(_ <= 999).map(_ * k))
        .filter(Numbers.isPalindrome)
        .max

    prod shouldEqual 906609
  }

  "Problem 003" should "find the largest prime factor of 600851475143" in {
    val n = 600_851_475_143L
    val max = Primes.factorize(n).max

    max shouldEqual 6857
  }

  "Problem 002" should "find the sum of even-valued Fibonacci numbers below 4 million" in {
    val sum =
      Fibonacci.getFibonacciStream()
        .takeWhile(_ < 4_000_000)
        .filter(_ % 2 == 0)
        .sum

    sum shouldEqual 4613732
  }

  "Problem 001" should "find the sum of all multiples of 3 or 5 below 1000" in {
    val sum =
      LazyList.from(1)
        .takeWhile(_ < 1_000)
        .filter(k => k % 3 == 0 || k % 5 == 0)
        .sum

    sum shouldEqual 233168
  }
}
