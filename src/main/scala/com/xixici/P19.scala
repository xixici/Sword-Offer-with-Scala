package com.xixici

/**
  * Created by xixici
  * Date: 2019/3/14 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
object P19 {
  def printMatrix(matrix: Array[Array[Int]]): Array[Int] = {
    val rows = matrix.length
    val cols = matrix(0).length
    if (rows == 0 || cols == 0) return null
    val left = 0
    val top = 0
    val bottom = rows - 1
    val right = cols - 1
  }
}
