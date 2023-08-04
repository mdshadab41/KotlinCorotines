import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val defferedJob: Deferred<Int> = async {
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: main
        delay(1000)   // Coroutine is suspended but Thread: main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: main
        15

    }

    val num: Int = defferedJob.await()
    println("Main program ends: ${Thread.currentThread().name}")    // main thread


}

suspend fun myOwnSuspendingFunc(){
    delay(1000)
}