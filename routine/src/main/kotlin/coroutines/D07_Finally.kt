package coroutines

import kotlinx.coroutines.*

/*
    使用finally来关闭资源

    join与cancelAndJoin都会等待所有清理动作完成才会继续往下执行
 */

fun main03() = runBlocking {
    val myJob = launch {
        try {
            repeat(100) { i ->
                println("job: I am sleeping $i")
                delay(500)
            }
        } finally {
            println("执行了finally块")
        }
    }

    delay(1300)
    println("hello world")

    myJob.cancelAndJoin()
    println("welcome")
}



/*
    对于该示例来说，当我们在协程的finally块中使用了挂起函数时，会导致出现CancellationException异常，原因在于运行着该代码块
    的协程已经被取消了。通常情况下，这并不会产生什么问题，因为大多数关闭操作（比如说取消一个job、关闭网络连接等）通常都是非阻塞的，
    并不需要使用挂起函数；然而，在极少数情况下，当我们在一个取消的协程中进行挂起操作时，我们可以将相应的代码放置到
    withContext(NonCancellable) {}
    当中，在这种结构中，我们实际上使用了withContext函数与NonCancellable上下文。
*/

fun main04() = runBlocking {
    val myJob = launch {
        try {
            repeat(100) { i ->
                println("job: I am sleeping $i")
                delay(500)
            }
        } finally {
            withContext(NonCancellable) {
                println("执行了finally块")
                delay(1000)
                println("在delay后执行的代码片段")
            }
        }
    }

    delay(1300)
    println("hello world")

    myJob.cancelAndJoin()
    println("welcome")
}

/*
    我们在使用协程时，如果取消了协程，那么很大一部分原因都在于协程的执行时间超过了某个设定值；我们可以通过手工引用与协程对应的Job的
    方式来启动一个单独的协程用于取消这个协程，不过Kotlin提供了一个内建的函数来帮助我们又快又好地做到这一点。
 */
fun main05() = runBlocking {
    withTimeout(1900) {
        repeat(1000) { i ->
            println("hello, $i")
            delay(400)
        }
    }
}




