package com.code.base.reflect

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

class D10ReflectProperty() {
	var name: String = "name"
	var age: Int = 18
}

fun main(args: Array<String>) {
	val clazz = D10ReflectProperty::class
	println(clazz.memberProperties) // 获取类所有的属性
	
	println("---------")
	//
	var reflactProperty = D10ReflectProperty()
	var variableToInvoke = clazz.memberProperties.find { it.name == "name" }
	// 调用属性
	println(variableToInvoke?.get(reflactProperty))
	println(variableToInvoke?.call(reflactProperty))
	println("---------")
	
	// 设置属性值
	if (variableToInvoke is KMutableProperty<*>) {
		variableToInvoke.setter.call(reflactProperty, "welcome")
	}
	
	println(variableToInvoke?.get(reflactProperty))
	
	println("---------")
	val instance = clazz.createInstance()
	var props = clazz.declaredMemberProperties
	props.forEach {
		when (it.name) {
			"name" -> {
				val kmp = it as KMutableProperty1<D10ReflectProperty, Any>
				kmp.set(instance, "Hadoop")
				println(it.get(instance))
			}
			"price" -> {
				println(it.get(instance))
			}
		}
	}
	
	println("---------")
	// 类属性
	val d01Props = D10ReflectProperty()
	var name = D10ReflectProperty::name
	
	name.set(d01Props, "Ruby")
	println(name.get(d01Props))
	
	val prop = D10ReflectProperty::age
	println(prop.get(d01Props))
	println("---------")
	// 顶层属性
	val topProp = ::test
	
	topProp.set("修改后的值")
	
	println(topProp.get())
	println(test)
}


var test = "test"