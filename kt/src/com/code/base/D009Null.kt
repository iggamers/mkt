package com.code.base

fun main(args: Array<String>) {
    println(convert2Int("23"))
    println(convert2Int("ab"))

    printMultiply("1","bb")
    printMultiply2("1","bb")
}

// 类型加? 表示这个类型可能为空
fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)

    if(null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)

//    println(a2Int * b2Int)

    if (null == a2Int) {
        println("param not int")
    } else if (null == b2Int) {
        println("param not int")
    } else {
        println(a2Int * b2Int)
    }
}
