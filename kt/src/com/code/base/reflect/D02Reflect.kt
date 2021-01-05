package com.code.base.reflect

open class D02ReflectParent {
}

class D02ReflectSon :D02ReflectParent(){
}

class D02ReflectDaughter:D02ReflectParent()



fun main(args: Array<String>) {
	val son :D02ReflectParent = D02ReflectSon()
	val daughter :D02ReflectParent = D02ReflectDaughter()
	println(son::class)
	println(son::class.java)
	println("-------------")
	println(daughter::class)
	println(daughter::class.java)
}