package com.code.base.oop.interf

fun main(args: Array<String>) {
    val i = D01InterfaceImpl()
    i.bar()
    i.foo()

    // var i2 = D01Interface()  err 接口不能实例化对象

    var c = C()
    c.method()
}

class D01InterfaceImpl : D01Interface {
    // 重载属性
    override var name: String = ""

    // 对方法进行写
    override fun bar() {
        println("bar")
    }
}

// 接口不能实例化对象
interface D01Interface {
    // name 属性, 抽象的重写
    var name: String

    // 必须被覆写
    fun bar()

    // 可以有方法体
    fun foo() {
        println("foo")
    }
}

interface A {
    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

// 这个时候C必须有自己的method
class C: A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
    }
}