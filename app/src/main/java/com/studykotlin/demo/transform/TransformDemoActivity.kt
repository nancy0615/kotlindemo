package com.studykotlin.demo.transform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlin.concurrent.thread

class TransformDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val  list = listOf("lily","lucy","nancy")
        val list1 = list.flatMap {
            listOf("名字是：$it")
        }
        for (item in list1) {
            println(item)
        }


        list.map {
            println( "当前的名字是：$it")
        }
    }





}