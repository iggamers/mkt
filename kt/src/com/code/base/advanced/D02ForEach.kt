package com.code.base.advanced

class D02ForEach {
    fun BBB(name: String) {
        println(name)
    }

    fun aa(): Unit {
        var items = listOf<String>("a", "b", "c", "d")
        items.forEach(this::BBB)
    }
}

fun main(args: Array<String>) {
    var items = listOf<String>("a", "b", "c", "d")

    //1.根据函数的定义
    items.forEach({
        a -> println(a)
    })

    //1.根据函数定义传递
    val print = fun(name: String) {
        println(name)
    }

    items.forEach(print)

    //2.看源码类似这样的效果
    for (element in items) {
        println(element)
    }
    //3.还可以这样
    items.forEach {
        a ->
        println(a)
    }

    //4.如果这个函数只接收一个参数，那我们可以使用 it 引用，而不用去指定左边的参数。
    items.forEach {
        println(it)
    }

    //5.还可以这样
    items.forEach(::println)


    var b = D02ForEach()
    items.forEach(b::BBB)
}