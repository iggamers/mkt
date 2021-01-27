package com.code.datastructures.queue

import java.util.*

class CircleArrayQueue {
    // 表示数组的最大容量
    private var maxSize: Int = 0
    // front 变量的含义做一个调整：front就只想队列的第一个元素，也就是说arr[front]就是队列的第一个元素
    // front 初始值0
    private var front: Int = 0
    // rear 变量的含义做一个调整：rear 指向队列的最后一个元素的后一个位置，因为希望空出一个空间做为约定
    // rear 的初始值  = 0
    private var rear:Int = 0
    // 该数组用于存放数据模拟队列
    private lateinit var arr: IntArray

    constructor(maxSize:Int){
        this.maxSize = maxSize
        this.arr = IntArray(this.maxSize)
    }

    // 判断队列是否满
    fun isFull():Boolean{
        return  (rear+1) %maxSize == front
    }

    // 判断队列是否为空
    fun isEmpty():Boolean{
        return  rear == front
    }

    // 添加元素
    fun add(value:Int){
        // 判断是否满
        if(isFull()){
            println("队列满，不能加入数据")
            return
        }
        arr[rear] = value
        rear = (rear +1) %maxSize
    }

    fun get():Int?{
        if(isEmpty()){
            return  null
        }
        val value =arr[front]
        front = (front +1) %maxSize
        return  value
    }

    fun show(){
        if (isEmpty()){
            println("队列空的,没有数据...")
            return
        }
        // 思路：从front开始遍历，遍历多少个元素
        // 动脑筋
        for(index in front until front + size()){
            println("${index%maxSize} -> ${arr[index %maxSize]}")
        }
    }

    // 求出当前队列有效数据的个数
    fun size():Int{
        return (rear + maxSize - front) %maxSize
    }

    // 显示队列的头数据，注意不是去除数据
    fun head():Int?{
        if (isEmpty()){
            return  null
        }
        return  arr[front]
    }
}

fun main(){
    var s = CircleArrayQueue(3)
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