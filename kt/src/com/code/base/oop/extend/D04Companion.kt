package com.code.base.oop.extend

fun main(args: Array<String>) {
    println("no:${D04Companion.no}")
    D04Companion.foo()
}

class D04Companion {
    // 伴生属性
    companion object {}
}

fun D04Companion.Companion.foo() {
    println("伴随对象的扩展函数")
}

var D04Companion.Companion.no: Int
    get() = 10
    set(value) {}
