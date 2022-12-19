package com.studykotlin.demo.coroutine2

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CorouTineTest {

    fun testCorouTine(){

        val test = runBlocking {
           val job1 = launch {
                delay(1000)
                println("========launch")
            }

            val job2 = async {
                delay(1000)
                println("========async")
                "async finished"
            }
            println(job2.await())
        }
    }
}