package com.code.base.advanced

fun main(args: Array<String>) {
    println((0..5).takeWhile { it < 3 }) // 输出 [0, 1, 2]
}