import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{

    println("Main Program Starts: ${Thread.currentThread().name}") //main thread

    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendFunc(1000)
        println("Fake work Finished: ${Thread.currentThread().name}")
    }

    mySuspendFunc(2000)

    println("Main Program ends: ${Thread.currentThread().name}") //main thread


}

suspend fun mySuspendFunc(time: Long){
    delay(time)
}