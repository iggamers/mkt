package com.code.base.interactive.jv

/*
    在Kotlin中，我们可以将具名对象或是伴生对象中定义的函数注解为@JvmStatic，这样编译器既会在相应对象的类中生成静态方法，
    也会在对象自身中生成实例方法。
 */
class D05Person {
	companion object {
		var name = "zhangsan"
		
		@JvmField
		var age = 200
		
		fun test1() {
			println("test1")
		}
		
		@JvmStatic
		fun test2() {
			println("test2")
		}
	}
}