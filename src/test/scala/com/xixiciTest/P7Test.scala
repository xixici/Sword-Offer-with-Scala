package com.xixiciTest

import com.xixici.P7
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/11 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P7Test extends FunSuite {
  test("P7Test") {
    val dd = 2
    val res = P7.Fibonacci(3)
    assert(res === dd)
  }
}


