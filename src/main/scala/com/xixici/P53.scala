package com.xixici

/**
  * Created by xixici
  * Date: 2019/4/27 
  * Project Name: sword-offer-scala-sbt
  * Project URL: https://github.com/xixici/sword-offer-scala
  **/
object P53 {
  def matchPattern(str: Array[Char], pattern: Array[Char]):Boolean = {
    if (str == null || pattern == null) {
      return false
    }
    val strIndex = 0
    val patternIndex = 0
    matchCore(str, strIndex, pattern, patternIndex);
  }

  def matchCore(chars: Array[Char], i: Int, chars1: Array[Char], i1: Int): Boolean = {

    false  
  }
}
