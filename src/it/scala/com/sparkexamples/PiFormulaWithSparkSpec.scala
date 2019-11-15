package com.sparkexamples

import org.scalatest.{Assertions, FlatSpec}

class PiFormulaWithSparkSpec extends FlatSpec with Assertions with SparkFactory {

  "PiFormulaWithSpark" should "calculate pi" in {
    val c = SparkPi.estimateCount(10000 * 2, 2)
    assert(c !== 0)
  }

}
