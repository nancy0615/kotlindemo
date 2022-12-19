package com.studykotlin.demo.map

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import java.util.*

class MapDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //创建map的方式 1.创建hashmap
        val map = HashMap<String,String>();
        map.put("day1", "map")
        map.put("day2", "list")
//
        //2.mapof创建不可变map,key to value
        //val map = mapOf<String,String>("day1" to "map","day2" to "list")
        //3.mapof创建不可变map,Pair(key,value)
//        val map = mapOf<String,String>(Pair("day1","map"),Pair("day2","list"))
        val map2 = mutableMapOf<String,String>()
//        map2["day3"] = "set"
        for((key,value) in map){
            println("key====="+key+"，value====="+value)
        }
        for(item in map){
            println("key====="+item.key+"，value====="+item.value)
        }
        map2.forEach{(key, value)-> println("key====="+key+"，value====="+value)}
        map2.forEach{println("key1====="+it.key+"，value1====="+it.value)}
    }
}