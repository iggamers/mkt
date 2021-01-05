package com.code.base.method

// 表达式作为函数体，返回类型自动推断
fun main(args:Array<String>){
    funBody();
    funBodyIsExpression();
    funBodyWithParams(1,2)
    funBodyIsExpressionWithParams(1,2) ;
}


fun funBody() {
    print("funWhitBody")
}

fun funBodyIsExpression() = println("funBodyIsExpression")

fun funBodyWithParams(a: Int, b: Int) {
    print("a:" + a + " b:" + b)
}

fun funBodyIsExpressionWithParams(a: Int, b: Int) = println("a:" + a + " b:" + b)

fun funWithReturnAndBody(a: Int, b: Int): Int {
    return a + b;
}
fun funWithReturnAndBodyIsExpression(a: Int, b: Int): Int = a + b

// 返回类型自动推断
fun funWithReturnAndBodyIsExpressionAuto(a: Int, b: Int) = a + b