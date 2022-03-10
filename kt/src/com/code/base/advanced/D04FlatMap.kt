package com.code.base.advanced

fun main(args: Array<String>) {
    val list = listOf(1..5, 3..8, 10..15)
    val flatList = list.flatMap {
        it
    }
    val flat = list.flatten()
    flatList.forEach(::print) // 输出 1 2 3 4 5 3 4 5 6 7 8 10 11 12 13 14 15
    println()
    flat.forEach (::print)
}