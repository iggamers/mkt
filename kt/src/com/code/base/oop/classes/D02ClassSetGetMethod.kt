package com.code.base.oop.classes

fun main(args: Array<String>) {
    // 创建对象
    var person = D02Person()

    // 调用属性
    println(person.name)

    // 调用方法
    person.printInfo()


    // 创建对象
    var person1 = D02Person()
    person1.name = "王凤"
    person1.age = 24;

    person1.printInfo()
}

/*
    var propertyName: propertyType = initializer
        getter()...
        setter()...

    backing field，支撑字段（域）
    backing property，支撑属性
 */
class D02Person {

    // 定义成员属性
    var name = "billy"
        get() = field
        set

    var age = 18
        // 自定义setter方法
        set(value) {
            if (value > 18) {
                "设置年龄->设置大于18岁"
            } else {
                "设置年龄->设置小于18岁"
            }
            field = value
        }
        get() = field

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor()

    // 定义成员方法
    fun printInfo(): Unit {
        println("我是$name,我今年$age")
    }
}