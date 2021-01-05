package com.code.base.ctrstatement

fun main(args: Array<String>) {
    // while条件中不能存在赋值语句，否则报错
    var i: Int = 0
    // 条件满足执行
    while (i < 10) {
        println(i)
        i++
    }

    // 至少执行一次
    do {
        println(i)
        i--
    } while (i > 0)
}