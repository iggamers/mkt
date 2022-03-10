package coroutines


import kotlinx.coroutines.*
import java.util.concurrent.CancellationException

/*
    协程的取消与超时
 */

fun main01() = runBlocking {
    val myJob = GlobalScope.launch {
        repeat(200) { i ->
            println("hello: $i")
            delay(500)
        }
    }

    delay(1100)
    println("hello world")

//    myJob.cancel(CancellationException("just a try"))
//    myJob.join()

    myJob.cancelAndJoin()

    println("welcome")
}

/*
    kotlinx.coroutines包下的所有挂起函数都是可取消的

    他们会检查协程的取消状态，当取消时就会抛出CancellationException异常

    不过，如果协程正在处于某个计算过程当中，并且没有检查取消状态，那么它就是无法被取消的
 */

fun main02() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime

        var i = 0

        while (i < 20) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I am sleeping ${i++}")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300)
    println("hello world")

    job.cancelAndJoin()
    println("welcome")
}

/*
    有两种方式可以让计算代码变为可取消的：

    1. 周期性地调用一个挂起函数，该挂起函数会检查取消状态，比如说使用yield函数
    2. 显式地检查取消状态

    如下示例将会采用第二种方式

    其中，isActive是协程的一个扩展属性，它是通过CoroutineScope对象添加的
 */

fun main06() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime

        var i = 0

        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I am sleeping ${i++}")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300)
    println("hello world")

    job.cancelAndJoin()
    println("welcome")
}

/*
    由withTimeout函数调用所抛出的TimeoutCancellationException异常是CancellationException的子类，当该异常抛出时，我们并未
    在控制台上看到整个异常堆栈信息，这是因为在取消的协程当中，CancellationException被认为是一种协程完成的正常原因而已。

    不过，我们在该示例中，是在main函数中使用了withTimeout函数调用

    既然CancellationException仅仅只是个异常而已，所有的资源也都会以通常的方式来关闭，那么我们就可以将相关代码放到一个try...catch
    块中；此外，Kotlin还提供了另外一个更加友好的函数调用：withTimeoutOrNull；从功能角度来看，它非常类似于withTimeout，不过当超时
    发生时，它并不会抛出CancellationException异常，而是会直接返回null

    对于withTimeout函数调用来说，如果将其放置到try...catch块中，那么调用形式就是下面这样：

    try {
        ....
    } catch(ex: TimeoutCancellationException) {
        ...
    }
 */

fun main() = runBlocking {
    val result = withTimeoutOrNull(1900) {
        repeat(1000) { i ->
            println("hello, $i")
            delay(300)
        }

        "hello world"
    }

    println("Result is $result")
}