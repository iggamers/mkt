package com.code.base.oop.extend

fun main(args: Array<String>) {
    var b = D02Base("大头儿子")
    b.print()

    val c = D02Child("abc")
    c.print()
    println("-------")

    executePrint(b)
    executePrint(c)
}

/*
    参数接收基类对象
    // 扩展函数的解析是静态的
    1. 扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
    2. 扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
    3. 调用是由对象声明类型所决定的，而不是由对象的实际类型决定
*/
fun executePrint(base: D02Base) {
    base.print()
}

// 只有open的类才能被继承
open class D02Base {
    var name :String = ""

    constructor(name: String) {
        this.name = name
    }
}

// 扩展方法
fun D02Base.print():Unit{
    println("我是 ${name}")
}

class D02Child : D02Base {
    constructor(name: String) : super(name)
}

// 给child拓展方法print
fun D02Child.print(): Unit {
    println("Child exFun")
}
