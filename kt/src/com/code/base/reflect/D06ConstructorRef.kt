package com.code.base.reflect

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

class D06ConstructorRef(val x: Int) {
}

fun myMethod(factory: (x: Int) -> D06ConstructorRef) {
	val r: D06ConstructorRef = factory(3)
	println(r.x)
}

fun main(args: Array<String>) {
	/*
	    构造方法引用（Constructor Reference）
	
	    要求有两点：
	
	    1. 函数对象的参数要与构造方法的参数保持一致（体现在参数个数与参数类型上）
	    2. 函数对象的返回结果要与构造方法所在类的类型保持一致
    */
	myMethod(::D06ConstructorRef)
	
	println("---------------")
	println(D06ConstructorRef::x.javaGetter) // 获取对应的java
	println(D06ConstructorRef::x.javaField)
	
	println("---------")
	
	println(D06ConstructorRef(10).javaClass)
	println(D06ConstructorRef(10).javaClass.kotlin)
	
	println(String.javaClass)
	println(String.javaClass.kotlin)
}