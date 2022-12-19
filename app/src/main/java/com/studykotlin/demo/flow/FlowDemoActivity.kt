package com.studykotlin.demo.flow

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.forEach
import kotlin.coroutines.*

class FlowDemoActivity : AppCompatActivity() {

   private var textview:TextView? = null

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.textview)


       findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
               getFlow()
            }
        }
    }

    fun flowSimple() = flow<Int> {
        for (i in 1..3){
            delay(3000)
            emit(i)
        }
    }
    fun getFlow() = runBlocking{
        launch {
            for(i in 1..3){
                println("I'm not bocked $i")
                delay(3000)
            }
        }
        flowSimple().collect {
            value->println(value)
        }
    }






}