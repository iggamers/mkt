package com.code.base.reflect

import kotlin.reflect.full.companionObject

class D012ReflectCompanion {
	companion object {
		fun method() {
			println("hello world")
		}
	}
}

fun main(args: Array<String>) {
	var reflectCompanion = D012ReflectCompanion::class
	var companionObj = reflectCompanion.companionObject // 获取类中的伴生对象
	
	println(companionObj)
	
	D012ReflectCompanion.method()
}