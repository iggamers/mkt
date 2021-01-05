package com.code.base

/*
     类型    取值范围
     Byte   -128                    ~   127
     Short  -32768                  ~   32767
     Int    -2147483648             ~   2147483647
     Long   -9223372036854775807    ~   9223372036854775807
     Float  小数点可以精确到6位
     Double 小数点可以精确到15-16位
     String 字符串,用"双引号引起来的字符串都可以存
 */
fun main(args: Array<String>) {
    baseType()
    stringType()
    arrayType()
}

fun arrayType() {
    // 定义数组方式一:自定义内容,[1,2,3]
    val arr1 = arrayOf(1, 2, 3)
    // 定义数组方式一:规则化内容,[0,2,4]
    val arr2 = Array(3, { i -> (i * 2) })

    // 数组遍历
    for (i in arr1) {
        println(i)
    }

    for (i in arr2) {
        println(i)
    }
}


fun stringType() {
    var str1: String = "aaaaaaaaaaaa";
    // 遍历字符串,意义不大
    for (c in str1) {
        // println(c)
    }

    // 三个引号 """包起来的字符串，支持多行
    val str3 = """
    多行字符串
    多行字符串
    """
    println(str3)   // 输出有一些前置空格


    // String 可以通过 trim() 方法来删除多余的空白。
    var str4 = "  内容  "
    println(str4.trim())

    // String 可以通过 trimMargin("|") 方法来删除"前导空格"
    // 前导空格:变量前面的空格
    var str5 = "  |内容|内容|内容|内容  "
    println(str5)
    println("--------")
}

fun baseType() {
    // 整型 Int Long
    var a = 10
    var b = 10L

    // 浮点型 Float Double
    var c = 10.0f
    var d = 10F
    var e = 10e10 //科学计数法

    // 字符型 Char String
    var f = 'C'
    var h = "CCCC"

    // 字节型 Byte
    var i: Byte = 1
    println("--------")
}