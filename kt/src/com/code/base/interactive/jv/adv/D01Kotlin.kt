package com.code.base.interactive.jv.adv

fun main(args: Array<String>) {
	val list = listOf<String>()
	println(list.myFilter())
	
	val list2 = listOf<Int>()
	println(list2.myFilter())
}


// 类型擦除，  java中的泛型是假泛型，在字节中都是object类型，然后再取数据的时候再进行强制转化，所以以下两个方法 如果没有注解则不能同时存在
// // JvmName 注解仅仅是给jvm和java调用的，kotlin中正常调用即可

fun List<String>.myFilter(): List<String> {
	return listOf("hello", "world")
}

@JvmName("myFilter2")
fun List<Int>.myFilter(): List<Int> {
	return listOf(1, 2)
}
