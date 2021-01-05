package com.code.base.ctrstatement

fun main(args: Array<String>) {
    // 基本条件比较
    var a = 1
    var b = 2
    var max = 0

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("max:${max}")

    // 可以简写为表达式
    if (a > b) max = a else max = b
    println("max:${max}")

    //可以赋值
    max = if (a > b) a else b
    println("max:${max}")

    // if表达式判断是否在区间
    val x = 5
    if(x in 1..8){
        print("x 在区间里面")
    }
}