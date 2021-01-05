package com.code.base.oop.generics

fun <T> printInfo(content: T) {
    when (content) {
        is Int -> println("传入的$content,是一个Int类型")
        is String -> println("传入的$content,是一个String类型")
        else -> println("传入的$content,不是Int也不是String")
    }
}

// 泛型约束
fun <T : Comparable<T>> sort(list: List<T>) {

}


fun main(args: Array<String>) {
    printInfo(10)
    printInfo("hello world")
    printInfo(true)

    // OK。Int 是 Comparable<Int> 的子类型
    sort(listOf(1, 2, 3))
    // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
    // sort(listOf(HashMap<Int, String>()))
}