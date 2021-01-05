package com.code.base.method

fun main(args: Array<String>) {
    value()
    variable()
}

fun value() {
    // 定义
    val a: Int

    // 定义并赋值
    val b: Int = 10

    // 定义和赋值分开,只能赋值一次
    val c: Int
    c = 10;

    // 不能二次赋值
    // c = 11;
}

fun variable() {
    var a: Int
    var b: String

    // 不能重复定义
    // var b:String ="hello";

    // 声明的时候赋值
    var c: Int = 1;

    // 声明和赋值分开
    var d: Int;
    d = 10;

    // 类型自动推断
    var e = 2;

    // var关键字变量可以修改
    e += 1;

    // 赋值必须类型完全匹配，不然报错
    var x = 10
    var y: Byte = 20
    x = y.toInt()
    var z = 20

    // 将if表达式中代码块最后一个值作为返回值
    var max = if (x > z) x else y
    var min = if (x > z) z else x
    println("max = $max, min = $min")

    var max1 = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min1 = if (x > y) {
        println("x > y")
        y
    } else {
        println("x <= y")
        x
    }


}