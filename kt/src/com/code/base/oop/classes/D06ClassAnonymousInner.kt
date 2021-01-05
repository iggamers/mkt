package com.code.base.oop.classes

fun main(args: Array<String>) {
    var btn = D06Button()
    // 使用匿名内部类调用方法
    btn.setOnClickListener(object : OnClickListener {
        override fun onClick() {
            println("按钮被点击了")
        }
    })
}

// 接口
interface OnClickListener {
    fun onClick();
}

class D06Button {
    fun setOnClickListener(listener: OnClickListener): Unit {

    }
}