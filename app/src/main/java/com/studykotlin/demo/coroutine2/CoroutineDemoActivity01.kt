package com.studykotlin.demo.coroutine2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlinx.coroutines.*
import kotlin.coroutines.*

class CoroutineDemoActivity01 : AppCompatActivity() {

   private var textview:TextView? = null

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.textview)


       findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
//                val test = CorouTineTest()
//                test.testCorouTine()
                cancleCoroutine02()
            }
        }
    }

    private fun cancleCoroutine01(){
        val blocking = runBlocking {
            val coroutine = CoroutineScope(Dispatchers.Default)
            coroutine.launch {
                delay(10000)
                println("coroutine1")
            }
            coroutine.launch {
                delay(1000)
                println("coroutine2")
            }
            delay(200)
            coroutine.cancel()
        }
    }

    private fun cancleCoroutine02(){
        val currentTime = System.currentTimeMillis()
        val coroutine = runBlocking {
            val launch1 = launch(Dispatchers.Default) {
                val i = 0
                var time = currentTime
                while (i<5){
                    ensureActive()
//    yield()
                    if(System.currentTimeMillis() > time){
                        println("开始执行${i}")
                        delay(5000)
                         time +=500
                    }
                }
            }
            delay(10000)
            launch1.cancelAndJoin()
            println("执行完毕")
        }

    }
}