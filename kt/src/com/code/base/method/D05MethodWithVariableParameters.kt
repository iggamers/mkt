package com.code.base.method

fun main(args:Array<String>){
    var i= funWithVariableParams(1,2,3);
    println(i);

    var b = funWithVariableParams(1,2)
    println(b)

}

fun funWithVariableParams(vararg args:Int):Int{
    var sum :Int =  0
    for(i in args){
        sum += i;
    }

    return  sum;
}