package com.xixiciTest

import com.xixici.P5
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/11 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P6Test extends FunSuite{
  test("P6Test") {
    val dd = Array(3,4,5,1,2)
    val res = P5.minNumberInRotateArray(dd)
    assert(res === 1)
  }
}
