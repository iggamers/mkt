package com.code.base.advanced

fun main(args: Array<String>) {
    println((0..5).fold(5) { acc, i -> acc + i }) // 输出 20
    println((0..5).fold(StringBuilder()) { acc, i -> acc.append(i).append(",") }) // 输出 0,1,2,3,4,5,
}