package com.code.base.oop.entrust

// 把属性存在映射中
class D05Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    val site = D05Site(mapOf(
            "name" to "爱就码",
            "url" to "www.i9code.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)
}