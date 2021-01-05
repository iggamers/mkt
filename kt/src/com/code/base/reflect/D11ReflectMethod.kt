package com.code.base.reflect

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberFunctions

class D11ReflectMethod(var price :Int = 1) {
	var name :String = "未知对象"
	fun printSomething(name : String) {
		println("something:$name")
	}
	
	fun printNothing() {
		println("nothing")
	}
	
	constructor(price: Int, name: String): this(price) {
		this.name = name
		println("secondary constructor")
	}
}

fun main(args: Array<String>) {
	val d11ReflectMethodClass = D11ReflectMethod::class
	println(d11ReflectMethodClass.memberFunctions)
	
	println("-------")
	// 调用对象
	val test = D11ReflectMethod(1)
	var functionToInvoke = d11ReflectMethodClass.functions.find { it.name == "printNothing"}
	functionToInvoke?.call(test)
	
	println("-------")
	var functionToInvoke2 = d11ReflectMethodClass.functions.find { it.name == "printSomething"}
	functionToInvoke2?.call(test,"abc")
	
	println("-------")
	val constructors = d11ReflectMethodClass.constructors
	println(constructors)
	constructors.forEach {
		if (it.parameters.size == 2) {
			val instance2 = it.call(34,"python")
			
			println(instance2.name)
			println(instance2.price)
		}
	}
	
	println("-------")
	
	var obj = d11ReflectMethodClass.createInstance()  // 调用无参构造构造方法
	d11ReflectMethodClass.functions.find { it.name == "printSomething"}?.call(obj,"abc")
	d11ReflectMethodClass.functions.find { it.name == "printNothing"}?.call(obj)
}