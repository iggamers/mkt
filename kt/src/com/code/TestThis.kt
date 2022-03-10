package com.code

class TestThis {
    fun d(t: TestThis){
        println("$t ---- $this")
    }
}

fun main (){
    val a = TestThis()
    a.d(a)
}