package com.lxl.chapter05

/**
 * 类里面函数的是方法
 * main里面的函数不是方法
 * 一般方法要通过对象调用
 * 函数可以直接使用
 * */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String="zhangshan"):Unit = {
      println("hi, " + name)
    }

    // 调用函数
//    sayHi("alice")
    sayHi()
    println(sayHi())

    println("--------------")
    // 调用对象方法
    Test01_FunctionAndMethod.sayHi("bob")

    // 获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("cary")
    println(result)
  }

  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)
    return "Hello"
  }
}
