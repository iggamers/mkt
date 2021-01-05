package com.code.base.oop.classes

fun main(args: Array<String>) {
    // 创建对象
    var person = D01Person()

    // 调用成员变量
    println(person.name)

    // 调用成员方法
    person.printInfo()
}

// 在Kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
// primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有若干参数
// 如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可省略
class D01Class(className:String){
    private  val className : String = className.toUpperCase()

    init {
        println(className)
    }
}

class D01Person {
    // 定义成员变量
    var name = "billy"
    var age  = 18

    // 定义成员方法
    fun printInfo():Unit{
        println("i am $name,i $age years old")
    }
}

// 可见性 visibility
// Kotlin提供了4种可见性修饰符：
// private, 本文件内能用
// protected,
// internal, 模块内能用
// public 都能用
class D011Person constructor(username: String) {

    private var username: String

    private var age: Int

    private var address: String

    init {
        // inti 代码块中 调用的形参默认是主构造方法传递过来的变量
        println(username)

        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    // 次构造方法  必须直接或者间接调用主构造方法
    constructor(username: String, age: Int): this(username) {
        println(username + ", " + age)

        this.username = username
        this.age = age
        this.address = "beijing"
    }

    constructor(username: String, age: Int, address: String): this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("username: ${this.username}, age: ${this.age}, address: ${this.address}")
    }
}
