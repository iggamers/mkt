package com.code.base.interactive

import com.code.base.interactive.kt.D04Exception


fun main(args: Array<String>) {
	val myException = D04Exception()
//    myException.myMethod()
	
	println("------------")
	
	val clazz = D04Exception()::class.java
	println(clazz)
	
	println("------------")
	
	println(D04Exception().javaClass)
}