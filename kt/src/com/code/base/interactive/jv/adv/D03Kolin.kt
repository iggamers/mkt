package com.code.base.interactive.jv.adv

// 注解 JvmOverloads 注解会生成多个重载方法
class D03Kolin @JvmOverloads constructor(x: Int, y: String = "hello") {
	
	fun myMethod(a: Int, b: String, c: Int = 2) {
		println("a: $a, b: $b, c: $c")
	}
}