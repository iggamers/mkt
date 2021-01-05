package com.code.base.reflect

import java.io.Serializable
import kotlin.reflect.full.superclasses

class D09Reflect<K, V>  {
	var k: K? = null
	
	var v: V? = null
}


class D09Serializable : Serializable,D09Interfacace

interface D09Interfacace

fun main(args: Array<String>) {
	val myTestClassType = D09Reflect::class
	println(myTestClassType.typeParameters)
	
	println(myTestClassType.typeParameters.size)
	
	println("first type: " + myTestClassType.typeParameters[0])
	println("second type: " + myTestClassType.typeParameters[1])
	
	println("----------")
	val mySerializableType = D09Serializable::class
	println(mySerializableType.superclasses)
}