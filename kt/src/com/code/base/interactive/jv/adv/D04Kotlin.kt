package com.code.base.interactive.jv.adv


import java.io.FileNotFoundException

/*
    在Kotlin中，不存在checked exception
 */

class D04Kotlin {
	// 表示这个方法可能抛出异常，主要是在假如被java调用，则可以被java进行try-catch捕获
	@Throws(FileNotFoundException::class)
	fun method() {
		println("method invoked")
		throw FileNotFoundException()
	}
}