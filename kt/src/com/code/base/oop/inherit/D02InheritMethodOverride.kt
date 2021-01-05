package com.code.base.oop.inherit

fun main(args: Array<String>) {
    var p = D02Person("大名")
    var s = D02Student("小名", 20, 99)
    p.wear()
    s.wear()

    println("---------")

    // 子类中对成员变量重写
    println(p.x)
    println(s.x)

}

open class D02Person {
    open var name: String = ""
    constructor(name: String) {
        this.name = name
    }

    // 属性x
    open var x: Int? = null
        // 重写了get方法，此处后面详解
        get() {
            field = 34
            return field
        }
    // 允许重载的方法,需要指定open
    open fun wear(): Unit {
        println("穿衣服")
    }
}

class D02Student : D02Person {
    var age = 0
    var score = 0

    constructor(name: String, age: Int, score: Int) : super(name) {
        this.age = age
        this.score = score
    }

    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试得了${score}分")
    }

    // 重写父类中的方法
    override fun wear() {
        super.wear()
        println("我是学生,我穿校服")
    }

    // 它覆盖对应属性后，对应的方法也被覆盖
    override var x: Int? = null
}


open class D021Person {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"
}
// 1. val 可以 override val
// 2. var 可以 override val
// 3. val 无法 override var
class D02Child(override var name: String): D021Person() {
    override fun method() {
        super.method()

        println("child method")
    }
}

class D021Child : D021Person() {
    override fun method() {
        super.method()

        println("child method")
    }

    override val name: String
        get() = super.name + " and child"
}


