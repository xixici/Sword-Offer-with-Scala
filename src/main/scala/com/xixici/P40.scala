package com.xixici

/**
  * Created by xixici
  * Date: 2019/3/25 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
object P40 {
  def findNumsAppearOnce(array: Array[Int], num1: Array[Int], num2: Array[Int]): Array[Int] = {

    if (array == null || array.length <= 1) {
      num1(0) = 0
      num2(0) = 0
    }
    val len = array.length
    var sum = 0
    var index = 0

    for (i <- 0 until len) {
      sum ^= array(i)
    }

    var flag = true
    for (index2 <- 0 until 32 if flag) {
      if ((sum & (1 << index2)) != 0) {
        index = index2
        flag = false
      }
    }
    println(index)
    for (i <- 0 until len) {
      if ((array(i) & (1 << index)) != 0) {
        num2(0) ^= array(i)
      } else {
        num1(0) ^= array(i)
      }
    }

    Array(num1(0), num2(0))
  }
}
