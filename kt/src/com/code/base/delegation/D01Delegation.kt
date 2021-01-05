package com.code.base.delegation

interface D01Delegation {
    fun myPrint()
}


class D01DelegationImpl(val str: String) : D01Delegation {
    override fun myPrint() {
        println("welcome $str")
    }
}

/*
   委托原理：

   by关键字后面的对象实际上会被存储在类的内部，编译器则会父接口中的所有方法实现出来，并且将
   实现转移给委托对象来去进行
 */

class MyClass(myInterface: D01Delegation) : D01Delegation by myInterface {
    // 如果自己提供了 则优先使用自己提供的
//    override fun myPrint() {
//        println("hello world")
//    }
}


fun main(args: Array<String>) {
    val myInterfaceImpl = D01DelegationImpl("zhangsan")
    MyClass(myInterfaceImpl).myPrint()
}


