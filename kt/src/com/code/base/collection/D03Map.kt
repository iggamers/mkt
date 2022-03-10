 package com.code.base.collection

fun main(args: Array<String>) {
	val myMap = hashMapOf("hello" to 1, "world" to 2)
	println(myMap["hello"])
	
	val myMap2: Map<String, Int> = HashMap(myMap)
	println(myMap2)
}