package com.code.base.oop.inherit

fun main(args: Array<String>) {
    val s = D01Student("小明", 11, 92)
    s.printInfo()

    println("--------")

    val s2 = D011Student("小明", 11, 11)
    s2.printInfo()
}

// 在Kotlin中，所有类在默认情况下都是无法被继承的，
// 换句话说，在Kotlin中，所有类默认情况下都是final的
// open的含义与final相反
open class D01Person(var name: String, var age: Int) {

}

// 在Kotlin中，如果一个类没有primary构造方法，那么这个类的每个secondary构造方法就需要通过
// super关键字来初始化父类型，或是通过其他secondary构造方法完成这个任务
// 不同的secondary构造方法可以调用父类型不同的构造方法
class D01Student(name: String, age: Int, var score: Int) : D01Person(name, age) {
    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试考了${score}分")
    }
}

// 子类没有主构造函数，需要在次构造函数中处理基类的主构造函数
class D011Student : D01Person {
    var score = 0

    // 需要在次构函数中处理基类的主构函数
    constructor(name: String, age: Int, score: Int) : super(name, age) {
        this.age = age
        this.score = score
    }

    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试得了${score}分")
    }
}

