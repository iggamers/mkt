package com.code.datastructures.queue

import com.code.datastructures.stack.ArrayStack
import java.util.*


// 使用一个数组模拟队列-编写一个ArrayQueue类
class ArrayQueue {
    // 表示数组的最大容量
    private var maxSize: Int = 0
    // 队列头
    private var front: Int = 0
    // 队列尾
    private var rear:Int = 0
    // 该数组用于存放数据模拟队列
    private lateinit var queue: IntArray

    // 构造函数
    constructor(maxSize:Int){
        this.maxSize = maxSize
        this.queue = IntArray(maxSize)
        // 指向队列头部，分析出front是指向队列头的前一个位置
        this.front = -1
        // 指向队列尾部，指向队列尾的数据（即是队列最后一个数据
        this.rear = -1
    }

    // 判断队列是否满
    fun isFull():Boolean{
        return rear ==  maxSize -1
    }

    // 判断队列是否为空
    fun isEmpty():Boolean{
        return  rear == front
    }

    // 添加数据到队列
    fun add(value:Int){
        // 判断队列是否满
        if(isFull()){
            println("队列已满,不能加入新数据！")
        }
        // 让rear后移
        rear++
        queue[rear] =value
    }

    // 或缺队列数据，出队列
    fun get():Int?{
        // 判断对嘞是否为空
        if(isEmpty()){
            return  null
        }
        front++

        return queue[front]
    }

    // 显示队列所有数据
    fun show(){
        // 这种方法打印会把数组中的所有元素打印出来
        // for((index,value) in queue.withIndex()){
        //    println("$index->$value")
        // }
        // 判断是否为空
        if(isEmpty()){
            return
        }
        for(index in  0 until (rear-front)){
            println("$index->${queue[index]}")
        }
    }

    // 显示队列头数据
    fun head():Int?{
        // 判断是否为空
        if(isEmpty()){
            return  null
        }
        return  queue[front +1]
    }
}

fun main(){
    var s = ArrayQueue(10)
    var key = ""
    var loop = true
    var scanner = Scanner(System.`in`)

    while (loop){
        println("show: 显示队列数据");
        println("exit: 退出程序");
        println("add: 表示添加数据到队列)");
        println("get: 表示从队列取出数据");
        println("head: 表示从队列查看数据");
        println("请输入你的选择：");
        key = scanner.next();
        when (key) {
            "show"->s.show()
            "add"->{
                println("请输入一个数：")
                val value = scanner.nextInt()
                s.add(value)
            }
            "get" -> {
                val value: Int? = s.get()
                println("$value")
            }
            "head"->{
                val value: Int? = s.get()
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