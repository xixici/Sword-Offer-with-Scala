package com.xixiciTest

import com.xixici.P31
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/21 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P31Test extends FunSuite {
  val A = Array(3, 32, 321)
  test("P31Test") {
    val Expected = 321323.toString
    val Actual = P31.PrintMinNumber(A)
    assert(Actual === Expected)
  }
}