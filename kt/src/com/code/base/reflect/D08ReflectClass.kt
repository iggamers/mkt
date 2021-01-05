package com.code.base.reflect

import kotlin.reflect.KClass

fun main(args: Array<String>) {
	// 通过引用对象获取kclass对象
	val kotlinLang = "kotlin"
	val kclass: KClass<out String> = kotlinLang::class
	println(kclass)
	
	println("------------")
	// 通过类获取kclass对象
	val kclassDataType: KClass<String> = String::class
	println(kclassDataType)
	
	println("------------")
	
	val kclass1: KClass<out String> = "kotlin"::class
	val kclass2: KClass<out String> = "java"::class
	val kclass3: KClass<out String> = "ruby"::class
	
	println(kclass1)
	println(kclass2)
	println(kclass3)
	println(kclass1 == kclass2)  // 一个类无论多少个实例对象，都对应相同的的Kclass对象
	
	println("------------")
	
	val kclass4 = Class.forName("java.util.Date").kotlin
	println(kclass4)
	
	println(kclass4 == Class.forName("java.util.Date"))
	println(kclass4 == Class.forName("java.util.Date").kotlin)
	
}