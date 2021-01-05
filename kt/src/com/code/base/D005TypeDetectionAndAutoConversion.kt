package com.code.base

fun main(args: Array<String>){
    val len = getStringLength("abcdefg")
    println(len)

    getStringLength(222)
}

fun getStringLength(obj: Any): Int {
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }
    // 在这里还有一种方法，与Java中instanceof不同，使用!is
    if (obj !is String) {
        println("传递不是字符串类型")
    }
    return 0
}
