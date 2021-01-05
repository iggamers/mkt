package com.code.base

fun main(args:Array<String>) {
    stringTemplate()

    // 转义字符
    var a: String = "hello \n world"
    println(a)

    // 当在3个引号之间的字符串 kotlin会原封不动输出来
    var b: String = """hello
        \n world
        welcome
    """
    println(b)

}

fun stringTemplate(){
    var a = 1;

    // ${变量}
    var s1 = "a is ${a}"
    println(s1)

    // 可以去掉{}括号
    var s2 = "a is $a"
    println(s2)

    // 调用方法，执行代码块
    var s3 = "call method -> ${helloWorld()}, execute body -> ${s2.replace("is","was")}"
    println(s3)
}

fun helloWorld(){
    println("hello world")
}