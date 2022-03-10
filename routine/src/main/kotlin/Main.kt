import kotlin.coroutines.*

fun main(){
    val continuation = suspend {
        println("in coroutine.")
        5
    }.createCoroutine(object:Continuation<Int>{
        override fun resumeWith(result: Result<Int>) {
            println("coroutine end:$result")
        }

        override val context= EmptyCoroutineContext
    })

}