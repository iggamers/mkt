package com.code.base

fun main(args: Array<String>) {
    println(D012Print("01"))
    println(D012Print("hello"))

    var a = 6
    // 每种情况最后一个表达式的值作为返回值。 when的分支情况必须有 else分支。
    var result = when (a) {
        1 -> {
            println("a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }
        else -> {
            println("a is other value")
            50
        }
    }
}

fun D012Print(str :String):String{
    // when 相当于其他语言的 switch case语句
    return  when(str){
        "hello" ->  "HELLO"
        "world" ->  "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}