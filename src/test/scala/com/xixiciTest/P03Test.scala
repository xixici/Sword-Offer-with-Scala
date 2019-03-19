package com.xixiciTest

import java.util

import com.xixici.P03
import com.xixici.util.ListNode
import org.scalatest.FunSuite

import scala.collection.JavaConverters._

/**
  * Created by xixici
  * Date: 2019/3/5 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
class P03Test extends FunSuite{
  var head = new ListNode(1)
  val a = new ListNode(2)
  val b = new ListNode(3)
  val c = new ListNode(4)
  head.next = a
  a.next = b
  b.next = c
  c.next = null
  test("P3Test") {
    val nodes = P03.printListFromTailToHead(head)
    assert(nodes === List(c, b, a, head))
  }
}
