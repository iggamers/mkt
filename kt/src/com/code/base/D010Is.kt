package com.code.base

fun main(args: Array<String>) {
    println(convert2Uppercase("abc"))
    println(convert2Uppercase(12))
}

// is关键字 判断变量的类型，如果判断是某个类型 无需在强制转换
fun convert2Uppercase(str :Any):String?{
    if (str is String){
        return str.toUpperCase()
    }

    return null
}