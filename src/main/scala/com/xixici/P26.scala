package com.xixici

import com.xixici.util.TreeNode

import scala.collection.mutable

/**
  * Created by xixici
  * Date: 2019/3/19 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
object P26 {
  def Convert(pRootOfTree: TreeNode): List[Int] = {
    if (pRootOfTree == null) return null
    val resultList = mutable.ListBuffer[Int]()
    val treeStack = mutable.ArrayStack[TreeNode]()
    treeStack.push(pRootOfTree)
    while(!treeStack.isEmpty) {
      val tempNode = treeStack.pop()
      if (tempNode != null) {
        resultList += tempNode.data
        treeStack.push(tempNode.right)
        treeStack.push(tempNode.left)
      }
    }
    resultList.toList
  }
}
