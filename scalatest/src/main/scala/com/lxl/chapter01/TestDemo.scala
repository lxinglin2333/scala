package com.lxl.chapter01

object TestDemo {
  def main(args: Array[String]): Unit = {

    def test4( sex : String = "男", name : String ): Unit = {
      println(s"$name, $sex")
    }
//    def test1(a:Int,b:Int)=1
//    var f: (Int, Int) => Int = test1

    // Scala 函数中参数传递是，从左到右
    //如果参数有默认值，但不是排在后面（一般都是排在后面），可以使用把参数名带上明确值是赋予那个参数
    test4(name="wusong")

    def calculator(a: Int, b: Int, op: (Int, Int) => Int)
    = op(a, b)
    // （1）标准版
    println(calculator(2, 3, (x: Int, y: Int) => {x + y}))
  }
}
