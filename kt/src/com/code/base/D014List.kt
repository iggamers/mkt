package com.code.base

fun main(args: Array<String>) {
    var array = listOf<String> ("abc","def","hjklmn")
    for (item in  array){
        println(item)
    }

    println("--------")

    // 判断一个变量是否在一一个集合中
    when {
        "abc" in array -> println("abc  in  collection")
    }
    println("--------")

    // 函数式编程
    array.filter {it.length > 5}.map {it.toUpperCase()}.sorted().forEach{ println(it)}
}