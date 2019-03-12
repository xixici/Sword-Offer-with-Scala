package com.xixici

import java.util

/**
  * Created by xixici
  * Date: 2019/3/5 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
object P3 {
  def printListFromTailToHead(head: ListNode): util.ArrayList[ListNode] = {
    if (head == null) {

    }
    val list = new java.util.ArrayList[ListNode]()
    val stack = new java.util.Stack[ListNode]()
    var _head = head
    while (_head != null) {
      stack.push(_head)
      _head = _head.next
    }
    while (!stack.isEmpty) {
      list.add(stack.pop())
    }
    list
  }
}
