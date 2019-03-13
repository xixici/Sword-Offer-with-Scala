package com.xixiciTest

import com.xixici.P5
import org.scalatest.FunSuite

/**
  * Created by xixici
  * Date: 2019/3/11 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P5Test extends FunSuite {

  test("testPush") {
    P5.push(1)
    P5.push(2)
    P5.push(3)
    assert(List(P5.pop(), P5.pop(), P5.pop()) === List(1, 2, 3))
  }

  test("testPop") {
    assertThrows[Exception](P5.pop())
  }
}
