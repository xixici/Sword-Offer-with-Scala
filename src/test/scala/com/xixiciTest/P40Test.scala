package com.xixiciTest

import com.xixici.P40
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/25 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P40Test extends FunSuite {
  test("P40Test") {
    val ttt = Array(2, 2, 3, 3, 9, 9, 4, 5, 6, 6)
    val Expected = Array(4, 5)
    val Actual = P40.findNumsAppearOnce(ttt, Array(4), Array(5))
    assert(Actual === Expected)
  }
}