package com.lxl.chapter01

/**
 * 函数柯里化*/
object TestDemo1 {

  def plainOldSum(x:Int,y:Int)= x + y  //非柯里化函数定义
  def curriedSum(x:Int)(y:Int)= x + y  //柯里化使用多个参数列表

  def main(args:Array[String]): Unit ={
    println(plainOldSum(1,5))
    println(curriedSum(1)(5))

    //通过柯里函数curriedSum定义变量
    val onePlus=curriedSum(1)_ //_ 第二个参数列表的占位符，
    println(onePlus(2)) //传入的是第二个参数
  }

}
