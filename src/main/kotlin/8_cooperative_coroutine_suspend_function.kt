import kotlinx.coroutines.*


fun main() = runBlocking{

    println("Main Program Starts: ${Thread.currentThread().name}")

    val job: Job = launch {
        for (i in 0..500){
            println("$i.")
            yield()
        }

    }

    delay(10)
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // main thread

}