package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(x: Int, accumulator: BigInt = 1): BigInt =
    if (x <= 1) accumulator
    else trFact(x - 1, x * accumulator)

  trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)
}
