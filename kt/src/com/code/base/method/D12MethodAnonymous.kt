package com.code.base.method


/*
    在默认情况下，lambda表达式中最后一个表达式的值会隐式作为该lambda表达式的返回值
    我们可以通过全限定的return语法来显式从lambda表达式返回值
 */

fun main(args: Array<String>) {
    val strings = arrayOf("hello", "world", "bye")

    strings.filter {
        val mayFilter = it.length > 3
        mayFilter
    }

    strings.filter {
        val mayFilter = it.length > 3
        return@filter mayFilter
    }


    /*
    匿名函数
    */
    fun(x: Int, y: Int) = x + y

    fun(x: Int, y: Int): Int {
        return x + y
    }

    val stringss = arrayOf("hello", "world", "bye")

    stringss.filter(fun(item): Boolean = item.length > 3).forEach(fun(item){ println(item)})
}

/*
    闭包

 */

fun main2(args: Array<String>) {
    var sum = ""

    val strings = arrayOf("hello", "world", "bye")

    strings.filter { it.length > 3 }.forEach {
        sum += it
    }

    println(sum)
}
