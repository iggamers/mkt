package com.code.base.oop.classes

fun main(args: Array<String>) {
    // 创建外部类对象
    var outer = D05Outer();
    var inner = D05Outer.Inner();

    // 调用方法
    outer.myFun()
    inner.myFun()
}

// 嵌套类
// 嵌套类（Nested Class）
// 嵌套类不能访问外部类的其他成员，只能访问另一个嵌套类
class D05Outer {
    var outerVal = 10

    fun myFun() {
        println("outer")
    }

    class Inner {
        fun myFun(): Unit {
            println("Inner")
        }
    }
}