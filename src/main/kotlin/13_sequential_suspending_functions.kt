import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("Main Program Starts: ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val msgOne = getMessgaeOne()
        val msgTwo = getMessgaeTwo()
        println("The Enntire message is: ${msgOne + msgTwo}")

    }

    println("complete in $time ms")
    println("Main Program Starts: ${Thread.currentThread().name}")


}
suspend fun getMessgaeOne(): String{
    delay(1000L)
    return "Hello"
}

suspend fun getMessgaeTwo(): String{
    delay(100L)
    return "World!!"
}