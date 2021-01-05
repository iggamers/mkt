package com.code.base.reflect


import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter
import kotlin.reflect.jvm.javaSetter


class D14RefectProperty {
	var name = "Java"
	val price = 22.3
}

var myTest = "myTest"

fun main(args: Array<String>) {
	val topProp = ::myTest
	println(topProp.javaField)
	
	println(topProp.javaGetter)
	println(topProp.javaSetter)
	
	val n = D14RefectProperty::name
	println(n.javaField)
	println(n.javaGetter)
	println(n.javaSetter)
	
	val prop = D14RefectProperty::price
	println(prop.javaField)
	println(prop.javaGetter)
}