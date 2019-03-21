package com.xixiciTest

import com.xixici.P32
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/21 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P32Test extends FunSuite {
  test("P32Test") {
    val Expected = 12
    val Actual = P32.GetUglyNumber_Solution(10)
    assert(Actual === Expected)
  }
}