package com.code.base.advanced

/*
  将函数作为参数或返回一个函数，称为高阶函数。
 */
fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

fun main(args: Array<String>) {
    var items = listOf(1, 2, 3, 4, 5, 6)
    items.map {
        println(it)
    }
}
