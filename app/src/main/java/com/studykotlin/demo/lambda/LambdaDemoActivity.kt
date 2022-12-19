package com.studykotlin.demo.lambda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlin.concurrent.thread

class LambdaDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var method1:(String)->Unit = {
//            println("今天天气$it")
//        }
//        var method2:(String,String)->String = {
//            str1,str2->str1
//        }
//        method1("晴朗")
//
//        var result = method2("kotlin","java")
//        println("我在学习$result")
//
//        var method3:(Int,Int)->Unit = {
//            number1 , _ ->
//            println("第一个数字是$number1")
//        }
//        method3(23,34)

        loginFunction("Lucy","123456"){
            if(true) println("服务器相应成功") else println("服务器响应失败")
        }
    }

    private fun loginFunction(userName:String,pwd:String,loginResult:(Boolean)->Unit){
        if(userName == null || pwd == null){
            return;
        }
        loginEngine(userName,pwd,loginResult)
    }
    private fun loginEngine(userName:String,pwd:String, loginResult:(Boolean)->Unit){
        if("Lucy"== userName && "12345" == pwd){
            loginResult(true)
        }else{
            loginResult(false)
        }
    }

}