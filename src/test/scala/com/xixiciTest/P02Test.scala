package com.xixiciTest

import org.scalatest.FunSuite
import com.xixici.P02.replaceSpace
/**
  * Created by xixici
  * Date: 2019/3/5 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P02Test extends FunSuite{
  var strOld = "We Are Happy"
  var strNew = "We%20Are%20Happy"
  val strNew20 = replaceSpace(strOld)

  test("P2Test"){
    assert(replaceSpace(strOld) === strNew)
  }
}