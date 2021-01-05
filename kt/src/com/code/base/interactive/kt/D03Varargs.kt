package com.code.base.interactive

import com.code.base.interactive.kt.D03Varargs

fun main(args: Array<String>) {
	val myVarargs = D03Varargs()
	val stringArrays = arrayOf("hello", "world", "hello world")
	
	myVarargs.myMethod(*stringArrays)  // spread operation *
}