package com.code.base.oop

// 密封类
/*
* 要指定密封类，您需要添加修饰符sealed 。密封的类无法实例化。 因此，是隐式的抽象。
* 默认情况下，密封类的构造函数是私有的。密封类的所有子类必须在同一文件中声明。密封类对于仅通过在编译时限制类型集来确保类型安全非常重要。
*
* 在Kotlin中，密封类可以称为类固醇的Enum类。
* 密封类允许我们创建具有不同类型的实例，
* 这与枚举不同， 枚举将我们限制为所有枚举常量使用相同的类型。在Enum类中不可能执行以下操作。
* */

sealed class Calculator

class Add: Calculator()

class Subtract: Calculator()

class Multiply: Calculator()

// 密封类通常与when语句一起使用，因为每个子类及其类型都作为个案。 此外，我们知道Sealed类会限制类型。 因此， when语句的else部分可以轻松删除。
fun calculate(a: Int, b: Int, cal: Calculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
    println(calculate(1, 2, Multiply()))
}
