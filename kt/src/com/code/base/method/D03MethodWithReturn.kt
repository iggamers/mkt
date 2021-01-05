package com.code.base.method

fun main(args: Array<String>) {
    val i = funWithParamsWithOutReturn(1,2)
    println(i);

    funWithOutReturn()

    val b = funWithReturn(1, 2);
    println(b)
}

// 无返回值的函数，可以使用Unit关键字
fun funWithOutReturn(): Unit {
    println(1)
}

fun funWithParamsWithOutReturn(a: Int, b: Int) {
    println(a + b)
}


fun funWithReturn(a: Int, b: Int): Int {
    return a + b;
}