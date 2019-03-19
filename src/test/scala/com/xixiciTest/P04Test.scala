package com.xixiciTest

import com.xixici.P04
import org.scalatest.{BeforeAndAfterEach, FunSuite}

import scala.collection.JavaConverters._

/**
  * Created by xixici
  * Date: 2019/3/5 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P04Test extends FunSuite with BeforeAndAfterEach{

  var pre: Array[Int] = _
  var in: Array[Int] = _

  override def beforeEach() {
    pre = Array(1, 2, 4, 7, 3, 5, 6, 8)
    in = Array(4, 7, 2, 1, 5, 3, 8, 6)
  }

  override def afterEach() {
    pre = null
    in = null
  }

  test("testConstructBTree") {
    assert(P04.reConstructBinaryTree(pre, in).data === 1)
    assert(P04.reConstructBinaryTree(pre, in).left.data === 2)
    assert(P04.reConstructBinaryTree(pre, in).right.data === 3)
  }
}
