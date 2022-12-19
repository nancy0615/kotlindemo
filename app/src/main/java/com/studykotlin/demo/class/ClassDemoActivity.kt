package com.studykotlin.demo.`class`

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlin.concurrent.thread

class ClassDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val studeClass1 = StudeClass1("lucy",30)
//        studeClass1.getStudyData()
//        var studeClass2 = StudeClass2();
//        studeClass2.study = "lucy"
//        println("getStudyData==============${ studeClass2.getStudyData()}")
//        println("age==============${ studeClass2.age}")

//        val person = SonDemo(32,"kotlin")
//        person.isDoWhat("kotlin");

        //?表示可为null，?.表示不能为null，为null不执行
        //!!表示编译器不做非null校验，运行是发现变量为null，抛空指针异常
        //?:标识为null返回?:后面的内容
//        var innerClass = InnerAndNestingClass()
//        println("内部类：今天温度是${ innerClass.InnerClass().getWeather()}`c")
//        var nestingClass = innerClass.getNestintWeather()
//        nestingClass?.nestingClassGetWeather()?:println("为null了")
//        //nestingClass!!.nestingClassGetWeather()
//        val lambdaSum:(Int,Int)->Int = {x,y -> x+y}
//
//        println("哈哈哈哈哈哈${lambdaSum(1,2)}")
//        vars(8)

//        var b:Byte = 1
//        var a:Int = b.toInt()
//        println("哈哈哈哈哈哈${a}")
//        getSum(3,4)
        createArray()
    }


    fun createArray(){
//        val arr1 = Array(5){i->i*2}    //[0,2,4,6,8]
//        for(arr in arr1){
//            println("当前数组的元素为${arr}")
//        }

//        val arr2 = Array(5){ 5 }  //[0]
//        arr2.forEach{
//            println("当前数组的元素为${it}")
//        }

//        val arr2 = arrayOfNulls<Int>(5)
//        arr2.forEach{
//            println("当前数组的元素为${it}")
//        }

//        var y = 0
//        do {
//            println(y--)
//        } while(y>0)

        for(arr in 0..10){
            if(arr == 3) continue
            println("当前元素为${arr}")
            if(arr>6) break
        }
    }

    public fun sum(s1:Int,s2:Int)= s1 + s2
    fun getSum(a:Int,b:Int){
        if ((a==3) and (b==3)) println("a 和 b 相等了") else println("a 和 b 不相等")
    }

    fun vars(number:Int){  //可变参数
        for(i in 0 until number){
            println("当前是${i}")
        }

        Thread({
            println("创建一个线程")
        }).start()

        Thread(Runnable {
            println("创建第二个线程")
        }).start()

        thread(priority = 1){
            println("创建第三个线程")

        }


    }



}