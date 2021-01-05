package com.code.base.oop.entrust

// 创建接口
interface D01EntrustBase {
    fun print()
}

// 实现此接口的被委托的类
class D01EntrustBaseImpl(val x: Int) : D01EntrustBase {
    override fun print() {
        print(x)
    }
}

// 通过关键字 by 建立委托类
// 要干的事情,别人正好能干,只需要把其他对象通过构造方法传递进来就可以了
class D01Derived(base: D01EntrustBase) : D01EntrustBase by base;


fun main(args: Array<String>) {
    val baseImpl = D01EntrustBaseImpl(10)
    baseImpl.print()

    // print创建对象,把真正干事的传递进来
    val derived = D01Derived(baseImpl)
    derived.print()
}