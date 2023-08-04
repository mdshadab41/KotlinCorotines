import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {

    println("Main programs starts: ${Thread.currentThread().name}")

    val job: Job = launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work ends: ${Thread.currentThread().name}")

    }

    job.join()
    println("Main program ends: ${Thread.currentThread().name}")    // main thread


}