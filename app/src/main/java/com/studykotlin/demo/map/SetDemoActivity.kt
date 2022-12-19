package com.studykotlin.demo.map

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class SetDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //创建set的方式 1.HashSet
        val set1 = HashSet<String>()
        set1.add("apple")
        set1.add("banana")
//
        //2.setOf创建不可变
        val set2 = setOf<String>("orange","grape")
        val set3 = mutableSetOf<String>()
        set3.add("watermelon")
        for(it in set1){
            println("key====="+it)
        }
//        set2.forEach{println("key====="+it)}
//        set3.forEach{println("key====="+it)}

        for(it in 0 until set3.size step 2){

        }

    }
}