package com.code.base.reflect

fun main(args: Array<String>) {
	// 获取kotlin中class对象
	val c = String::class //KClass
	println(c)
	
	println("-------")
	// 获取对应的java对象
	val c2 = String::class.java
	println(c2)
}

