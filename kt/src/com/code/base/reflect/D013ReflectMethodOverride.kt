package com.code.base.reflect

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions


class D013ReflectMethodOverride {
	fun method(message: String) {
		println("执行带String参数的方法： $message")
	}
	
	fun method(message: String, price: Double) {
		println("执行带String, Double参数的方法: $message $price")
	}
}

fun main(args: Array<String>) {
	val clazz = D013ReflectMethodOverride::class
	val instance = clazz.createInstance()
	
	val funs = clazz.declaredFunctions
	
	for (f in funs) {
		if (f.parameters.size == 3) {  // 方法的第一个参数永远是对象，所以说应该是参数数目加1
			f.call(instance, "Ruby", 23.4)
		}
		
		if (f.parameters.size == 2) {
			f.call(instance, "Flutter")
		}
	}
}