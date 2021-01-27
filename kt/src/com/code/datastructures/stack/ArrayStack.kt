package com.code.datastructures.stack

import java.util.*

class ArrayStack {
    private  var maxSize: Int = 0  // 栈大小
    private lateinit var stack :IntArray // 数组,数组模拟栈，数据就放在该数组上
    private  var top: Int = -1 // top表示栈顶,初始化为-1

    constructor(maxSize :Int){
        this.maxSize = maxSize
        stack = IntArray(maxSize)
    }


    // 栈满
    fun isFull():Boolean {
        return top  == maxSize -1
    }

    // 栈空
    fun isEmpty():Boolean {
        return  top  == -1
    }

    // 入栈
    fun push(value:Int) {
        // 先判断栈是否满了
        if(isFull()){
            println("栈满")
            return
        }
        top++
        stack[top] = value
    }

    // 栈空
    fun pop() :Int? {
        // 先判断栈是否为空
        if(isEmpty()){
            return null
        }
        val value = stack[top]
        top--
        return  value
    }

    // 遍历 需要从栈顶开始显示数据
    fun list() {
        if (isEmpty()){
            println("栈空,没有数据！")
        }
        var i :Int = top
        while ( i >= 0){
            print("${stack[i]} ")
            i--
        }
        println()
    }
}

fun main(){
    var s = ArrayStack(10)
    var key = ""
    var loop = true
    var scanner = Scanner(System.`in`)

    while (loop){
        println("show: 表示显示栈");
        println("exit: 退出程序");
        println("push: 表示添加数据到栈(入栈)");
        println("pop: 表示从栈取出数据(出栈)");
        println("请输入你的选择：");
        key = scanner.next();
        when (key) {
            "show"->s.list()
            "push"->{
                println("请输入一个数：")
                val value = scanner.nextInt()
                s.push(value)
            }
            "pop" -> {
                val value: Int? = s.pop()
                println("$value")
            }
            "exit"->{
                scanner.close()
                loop = false
            }
            else->"请输入你的选择："
        }
    }

}