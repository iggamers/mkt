package com.code.base.interactive.jv.adv


class D02Kotlin {
	val a: Int
		@JvmName("getAValue")
		get() = 20
	
	fun getA() = 30
}

fun main(args: Array<String>) {
	val myClass = D02Kotlin()
	
	println(myClass.getA())
	println(myClass.a)
}