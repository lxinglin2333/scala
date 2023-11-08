package com.lxl.chapter02

object valueDemo {
  def main(args: Array[String]): Unit = {
    /*
    （1）声明变量时，类型可以省略，编译器会自动推导
    var i:Int = 10 等于 var i = 10
    （2）声明变量时要有初始值
    （3）scala类型确定后就不能转变，为强类型语言
     */

    //var声明变量（后续可变）
    var i:Int = 10
    //val声明变量（后续不可变）
    val j:Int = 20

    print(i,j)
   //换行的实用技巧
    val  s =
      s"""
      | select
      | name,
      | age,
      | socre
      | from student
      | where ${i} = ${j}
      """.stripMargin

    print(s)
  }
}
