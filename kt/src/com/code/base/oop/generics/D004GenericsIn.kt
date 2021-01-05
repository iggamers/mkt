package com.code.base.oop.generics

/*
    Kotlin: 声明处协变； Java： 使用处协变

    Kotlin中的out关键字叫做variance annotation，因为它是在类型参数声明处所指定的，因此我们
    称之为声明处协变（declaration-site variance）。

    对于Java来说则是使用处协变（use-site variance），其中类型通配符使得类型协变成为可能。
 */



fun main(args: Array<String>) {
    println("-----")

    // 对于"in"泛型来说，我们可以讲父类型对象赋给子类型引用
    val consumer1: Consumer<ApplePear> = Human()
    val consumer2: Consumer<ApplePear> = Man()
    val consumer3: Consumer<ApplePear> = Boy()

}


class Human: Consumer<Fruit> {

    override fun consume(item: Fruit) {
        println("Consume Fruit")
    }
}

class Man: Consumer<Apple> {

    override fun consume(item: Apple) {
        println("Consume Apple")
    }
}

class Boy: Consumer<ApplePear> {

    override fun consume(item: ApplePear) {
        println("Consume ApplePear")
    }
}