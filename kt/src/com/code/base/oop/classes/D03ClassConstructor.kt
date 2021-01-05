package com.code.base.oop.classes

fun main(args: Array<String>) {
    // 主构造方法创建对象
    var p = D03Person("大头儿子",8)
    p.printInfo()

    println("---------")
    // 次构造方法
    var b = D03Person("小头爸爸",33,"上海")
    b.printInfo()
}

// 定义类和主构造函数
class D03Person(name:String,age:Int){
    // 定义属性，类中的变量必须初始化
    var name:String = name
    var age = age
    var city = "中国"

    // 初始化方法-->主构造函数完成之后被调用
    init {
        println("init method is called: name:$name,age$age,city$city")
    }

    // 次构造函数-->在初始化函数之后被执行
    constructor(name: String,age: Int,city:String):this(name,age){
        this.city = city
    }

    fun printInfo():Unit{
        println("I‘m $name, $age years old, in $city")
    }
}

// 主构函数中,定义成员属性 通过如果主构造方法中 变量带有 var/val 关键字则 改变量为成员属性
// 次构函数不能直接定义成员属性
class D031Student (private val username: String, private val age: Int, private var address: String) {

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

/**
 * 如果构造方法拥有注解或是可见性修饰符，
 * 那么constructor关键字就是不能省略掉的，并且它位于修饰符后面
 */

class D032Student private constructor(username: String) {

}

/**
 * 在JVM上，如果类的primary构造方法的所有参数都拥有默认值，那么kotlin编译器就会为这个类生成一个不带参数的构造方法，
 * 这个不带参数的构造方法会使用这些参数的默认值，这样做的目的在于可以跟Spring等框架更好地集成。
 */

class D033Student (val username: String = "zhangsan") {

}
