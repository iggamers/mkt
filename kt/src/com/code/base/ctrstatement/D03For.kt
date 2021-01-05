package com.code.base.ctrstatement

fun main(args: Array<String>) {
    val items = arrayOf(1, 2, 3, 4, 5, "a")
    println("--------最基本的遍历--------")
    for (item in items) {
        println(item)
    }
    println("--------遍历的时候,得到索引--------")
    for (index in items.indices) {
        println("$index->${items[index]}")
    }

    println("--------遍历的时候,得到索引和值--------")
    for ((index, value) in items.withIndex()) {
        println("$index->$value")
    }
}