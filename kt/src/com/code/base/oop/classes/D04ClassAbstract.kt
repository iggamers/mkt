package com.code.base.oop.classes

fun main(args: Array<String>) {
    var man = D04Man()
    var woman = D04Woman()
    man.eat()
    woman.eat()
}

// 抽象类
abstract class D04Person {
    // 名字
    var name: String = ""

    // 吃饭
    abstract fun eat():Unit
}

class D04Man : D04Person() {
    override fun eat() {
        println("我吃的多，我很强壮")
    }
}

class D04Woman : D04Person() {
    override fun eat() {
        println("我吃的少,但是我很苗条")
    }
}