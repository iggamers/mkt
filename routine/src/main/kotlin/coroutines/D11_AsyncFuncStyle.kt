package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
    异步风格的函数
 */


fun main11() {
    val elapsedTime = measureTimeMillis {
        val value1 = intValue1Async()
        val value2 = intValue2Async()

        runBlocking {
            println("the answer is: ${value1.await() + value2.await()}")
        }
    }

    println("total time: $elapsedTime")
}


private suspend fun intValue1(): Int {
    delay(2000)
    return 15
}

private suspend fun intValue2(): Int {
    delay(3000)
    return 20
}

fun intValue1Async() = GlobalScope.async {
    intValue1()
}

fun intValue2Async() = GlobalScope.async {
    intValue2()
}



/*
    使用async进行结构化并发程序开发
 */

fun main() = runBlocking {
    val elapsedTime = measureTimeMillis {
        println("the answer is: ${intSum()}")
    }

    println("total time: $elapsedTime")
}


private suspend fun intSum(): Int = coroutineScope {
    val value1 = async { intValue1() }
    val value2 = async { intValue2() }

    value1.await() + value2.await()
}


