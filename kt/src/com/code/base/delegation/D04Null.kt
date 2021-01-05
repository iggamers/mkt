package com.code.base.delegation

import kotlin.properties.Delegates

// 非空属性
// notNull适用于那些无法在初始化阶段就确定属性值的场合
class D04Null {
    var address: String by Delegates.notNull<String>()
}

fun main(args: Array<String>) {
    val myPerson = D04Null()

    myPerson.address = "suzhou"
    println(myPerson.address)
}