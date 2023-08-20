import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main(){
    //(1..10000).forEach {
//    GlobalScope.launch {
//      val threadName = Thread.currentThread().name
//      println("$it printed on thread $threadName")
//    }
//  }
//  Thread.sleep(1000)
//  GlobalScope.launch {
//    println("Hello Coroutine!!")
//    delay(500)
//    println("Right back at yaa!!")
//  }
//  Thread.sleep(1000)

//  val job1 = GlobalScope.launch(start = CoroutineStart.LAZY) {
//    delay(200)
//    println("Pong!")
//    delay(200)
//  }
//
//  GlobalScope.launch {
//    delay(200)
//    println("Ping!!")
//    job1.join()
//    println("Ping!")
//    delay(200)
//  }
//
//  Thread.sleep(1000)


//  with(GlobalScope){
//    val parentJob = launch {
//      delay(200)
//      println("I'm the parent")
//      delay(200)
//    }
//    launch(context = parentJob){
//      delay(200)
//      println(" I'm the Child")
//      delay(200)
//    }
//    if(parentJob.children.iterator().hasNext()){
//      println("The Job has Children!!")
//    }else{
//      println("The Job has no children!")
//    }
//  }
//
//  Thread.sleep(1000)

//  var isDoorOpen = false
//  println("Unlocking the door..please wait.\n")
//  GlobalScope.launch {
//    delay(3000)
//
//    isDoorOpen = true
//  }
//  GlobalScope.launch {
//    repeat(4){
//      println("Trying to open the door..\n")
//      delay(800)
//
//      if(isDoorOpen){
//        println("Open the door!!\n")
//      }else{
//        println("The door is still locked!!")
//      }
//    }
//
//  }
//  Thread.sleep(5000)

    GlobalScope.launch {
        val bigThreadName = Thread.currentThread().name
        println("I am job 1 in thread $bigThreadName ")
        delay(200)
        GlobalScope.launch(Dispatchers.Main) {
            val uiThreadName = Thread.currentThread().name
            println("I am job 2 in thread $uiThreadName")

        }
    }

    Thread.sleep(1000)

}