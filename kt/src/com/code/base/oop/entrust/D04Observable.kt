package com.code.base.oop.entrust

import kotlin.properties.Delegates

// 可观察属性
class D04Observable {
    var name: String by Delegates.observable("默认值") {
        prop, old, new ->
        println(prop)
//      println("旧值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>) {
    val user = D04Observable()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}