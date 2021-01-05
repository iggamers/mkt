package com.code.base.oop.classes
// 内部类（Inner Class）

/*
    关于嵌套类与内部类之间的区别与联系：

    1. 嵌套类：对应于Java的静态内部类（即有static关键字修饰的内部类），只要在一个类的内部定义了另外一个类，那么这个类
    就叫做嵌套类，相当于Java当中有static关键字修饰的内部类。
    2. 内部类：对应于Java中的非静态内部类（即没有static关键字修饰的内部类），使用inner关键字在一个类的内部所定义的另外
    一个类就叫做内部类，相当于Java当中没有static关键字修饰的内部类。
 */
class D07Outer{
    private var str: String = "hello world"

    inner class D07Inner {
        fun innerMethod() = this@D07Outer.str
    }

    // 局部嵌套类
    fun getName(): String {

        class LocalNestedClass {
            val name: String = "mytest"
        }

        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}


fun main(args: Array<String>) {
    println(D07Outer().D07Inner().innerMethod())

    println(D07Outer().getName())


    val person = Person("zhangsan", 20)
    person.getPerson()
}


/*
    Kotlin访问外部类变量的方式：this@OuterClass.str
    Java访问外部类变量的方式：OuterClass.this.str
 */

class Person(val name: String, var age: Int) {

    private val str: String = "Person属性"

    private inner class PersonFeature(var height: Int, var weight: Int) {

        private val str: String = "PersonFeature属性"

        fun getPersonFeature() {
            val str: String = "局部变量"

            println("身高： $height， 体重：$weight")

            println("${this@Person.str}")
            println("${this.str}")
            println(str)

            this@Person.method()
        }
    }

    private fun method() {
        println("执行了Person的method方法")
    }

    fun getPerson() {
        val personFeature = PersonFeature(120, 180)
        personFeature.getPersonFeature()
    }
}
