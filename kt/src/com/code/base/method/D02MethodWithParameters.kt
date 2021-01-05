package com.code.base.method

fun main(args: Array<String>) {
    // 无参数方法调用
    funWithOutParams()

    // 有参方法调用
    funWithParams(1,1)
}


// 无参数方法
fun funWithOutParams(){
    println("我是无参方法")
}

// 有参方法
fun funWithParams(a: Int, b: Int) {
    println("我是有参方法："+"a:" + a + " b:" + b)
}
