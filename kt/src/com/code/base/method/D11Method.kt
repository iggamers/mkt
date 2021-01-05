package com.code.base.method

// 高阶函数
fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}

fun main(args: Array<String>) {
    println(myCalculate(2, 3, {x, y -> x + y}))
    println(myCalculate(2, 3, {x, y -> x - y}))
    println(myCalculate(2, 3, {x, y -> x * y}))

    println(myCalculate(2, 3) {
        x, y -> x + y
    })


    println("---------")
    val str = "hell7worl9"

    println(str.filter { it.isLetter() })

    println("---------")
    val strings = arrayOf("hello", "world", "bye", "helloworlD", "welcome")

    strings.filter { it.contains("h") }.forEach{ println(it) }

    println("--------")

    strings.filter{ it.length > 4 }.forEach { println(it) }

    println("--------")

    strings.filter { it.endsWith("d", ignoreCase = true) }.map { it.toUpperCase() }.forEach { println(it) }
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)

        if (predicate(element)) {
            sb.append(element)
        }
    }

    return sb.toString()
}
