package com.code.base.method

/*
    内联函数（inline function）

 */
// 类似c++ inline 调用地方过多导致字节嘛比较大
inline fun myCalculate(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    println(myCalculate(1, 2))
}