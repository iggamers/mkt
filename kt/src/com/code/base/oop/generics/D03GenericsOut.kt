package com.code.base.oop.generics
import kotlin.test.assertTrue
/*
    声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out。
    使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：
*/

// 在Kotlin中：Consumer in, Producer out

class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {

    fun get(): T {
        return this.value
    }
}

class ParameterizedConsumer<in T>{

    fun toString(value: T): String {
        return value.toString()
    }
}

fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    var result = parameterizedClass.getValue()

    assertTrue(result is String)

    println("--------")

    val parameterizedProducer = ParameterizedProducer("welcome")
    val myRef: ParameterizedProducer<Any> = parameterizedProducer

    assertTrue(myRef is ParameterizedProducer<Any>)

    println("--------")

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer

    assertTrue(myRef2 is ParameterizedConsumer<Int>)


    // 对于"out"泛型来说，我们可以将子类型对象赋给父类型引用
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()
}


/*
    如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out

    produce = output = out
 */

interface Producer<out T> {
    fun produce(): T
}

/*
    如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in

    consume = input = in
 */

interface Consumer<in T> {
    fun consume(item: T)
}

/*
    如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型
 */

interface ProducerConsumer<T> {
    fun product(): T

    fun consume(item: T)
}


open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()



class FruitProducer: Producer<Fruit> {

    override fun produce(): Fruit {
        println("Produce Fruit")

        return Fruit()
    }
}

class AppleProducer: Producer<Apple> {

    override fun produce(): Apple {
        println("Produce Apple")

        return Apple()
    }
}

class ApplePearProducer: Producer<ApplePear> {

    override fun produce(): ApplePear {
        println("Produce ApplePear")

        return ApplePear()
    }
}

