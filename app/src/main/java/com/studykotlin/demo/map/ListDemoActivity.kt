package com.studykotlin.demo.map

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import java.util.*
import kotlin.collections.ArrayList

class ListDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //创建list的方式 1.创建ArrayLit
        val list1 = ArrayList<String>()
        list1.add("apple")
        list1.add("banana")
//
        //2.listOf创建不可变
        val list2 = listOf<String>("orange","grape")
        val list3 = mutableListOf<String>()
        list3.add("watermelon")
        list3.add("banana")
        list3.add("watermelon")
        list3.add("orange")
        list3.add("banana")
        list3.add("watermelon")
        for(it in list1){
            println("key1====="+it)
        }
        list2.forEach{println("key2====="+it)}
        list3.forEach{println("key3====="+it)}
        for(it in 0..list2.size-1){    //..左闭右闭
            println("key4==${it}"+"====${list2[it]}")
        }
        for(it in 0 until list3.size-1){  //until 左闭右开
            println("key5==${it}"+"====${list3[it]}")
        }
        for(it in list3.size-1 downTo 0){  //downTo 左闭右闭，顺序从大到小
            println("key6==${it}"+"====${list3[it]}")
        }
        repeat(list3.size){
            println("key7==${it}"+"====${list3[it]}")
        }

        for(i in 0 until list3.size step 2){
            println("key8==${i}"+"====${list3[i]}")
        }
    }
}