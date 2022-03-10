package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    如果返回List<String>结果类型，那么就表示只能一次性返回所有值。要想能够表示可以异步计算的流式的值，我们就可以使用
    Flow<String>类型，它非常类似于Sequence<String>类型，但其值是异步计算的。

    1. Flow构建器是通过flow来实现的。
    2. 位于flow{ }构建器中的代码是可以挂起的。
    3. myMethod方法无需再使用suspend标识符，值是通过emit函数来发射出来的
    4. Flow里面的值是通过collect方法来收集的

 */


private fun myMethod(): Flow<Int> = flow {
    for (i in 1..4) {
        delay(100)
//        Thread.sleep(100)
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    launch {
        for (i in 1..4) {
            println("hello $i")
            delay(200)
        }
    }

    myMethod().collect { println(it) }
}

/*
    Flow是顺序执行的

    对于Flow的收集操作来说，它是运行在调用了终止操作的那个协程上，默认情况下，它是不会启动新的协程的。每个emit的元素值都会
    由所有的中间操作进行处理，最后再由终止操作进行处理。本质上，就是由上游进入到了下游。
 */

fun main21() = runBlocking {
    (1..10).asFlow().filter {
        println("Filter: $it")
        it % 2 == 0
    }.map {
        println("Map: $it")
        "Hello: $it"
    }.collect {
        println("Collect: $it")
    }
}
