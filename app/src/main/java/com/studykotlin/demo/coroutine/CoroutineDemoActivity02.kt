package com.studykotlin.demo.coroutine

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlin.coroutines.*

class CoroutineDemoActivity02 : AppCompatActivity() {

   private var textview:TextView? = null

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.textview)


       findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
                val coroutine = suspend {
                      5
                }.createCoroutine(object: Continuation<Int>{
                    override val context: CoroutineContext = EmptyCoroutineContext

                    override fun resumeWith(result: Result<Int>) {
                        println("===============${result}")
                    }
                })
                coroutine.resume(Unit)
            }
        }
    }

}