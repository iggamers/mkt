package com.code.base.reflect

/*
    属性引用 （Property Reference）

    属性引用的用法与函数（方法）引用的用法完全一致，都是通过 ::形式来引用

    表达式 ::a 表示类型KProperty<Int>的属性对象，我们可以通过get()来获取其值，也可以通过name属性来获取其名字

    对于可变属性来说，比如说 var b = 5，::b返回的是类型KMutableProperty<Int>的值，它拥有一个set()方法

 */

const val a = 3

var b = 5

fun main(args: Array<String>) {
	println(::a)
	println(::a.get())
	println(::a.name)
	
	println("----------")
	
	::b.set(10)
	println(b)
	println(::b.get())
	
	println("----------")
	propertyClass()
	println("----------")
	extends()
}

/*
    要想访问一个类当中的成员属性，需要使用全限定名称
 */

fun propertyClass() {
	val values = listOf("a", "abc", "abcd")
	println(values.map(String::length))
	
	println("--------")
	
	val x = MyClass::x // 引用类中的属性
	println(x.get(MyClass(10)))
	
}

class MyClass(val x: Int)


/*
    扩展属性
 */

val String.firstChar: Char
	get() = this[0]

fun extends() {
	// 属性引用
	println(String::firstChar.get("xyz"))
}