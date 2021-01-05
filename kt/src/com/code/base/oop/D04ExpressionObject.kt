package com.code.base.oop

fun main(args: Array<String>) {
    var s1  = Site
    var s2 = Site

    s1.url = "www.i9code.cn"
    s2.name = "i9code"

    s2.url = "www.code.cn"
    s2.name = "code"

    println(s1.name)
    println(s2.name)
}


object Site {
    var url :String = ""
    var name :String = ""
}

/*
* 在Kotlin中，object的神奇之对象表达式，什么是对象表达式呢？
* 我们把它认为是一个匿名类的实例，该匿名类可以继承自某个类或者多个接口。
* 不过，我们需要通过object关键字将其声明，表示这是一个对象。
*
* 表达式对象是单例
* */
