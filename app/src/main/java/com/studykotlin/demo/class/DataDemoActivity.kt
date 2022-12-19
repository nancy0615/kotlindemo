package com.studykotlin.demo.`class`

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlin.concurrent.thread

class DataDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val dataDemo = DataDemo("today",1)
//        val datademo2 = dataDemo.copy(index=3)
////        dataDemo.getData()
////        dataDemo.getStr()
//
//        println(dataDemo)
//        println(datademo2)

//        getCar(SealedDemo.Car1())
//        val fanxingDemo = FanxingDemo<Int>(2)
//        val fanxingDemo1 = FanxingDemo<String>("泛型")
//        fanxingDemo.getFan(3)
//        fanxingDemo1.getFan("泛型")
//        println(copyWhenGreater(listOf("hah","89"),"89"))
//        getFanXing(listOf("12","32","43"))

//        val light = Light.GREEN
//        println(light.name)
//        println(light.ordinal)
//        println(Light.valueOf("RED"))
//        println(Light.values())
//
//        getName<Light>()
        println(show(Light.YELLOW))
    }
    fun show(light:Light) =
         when(light){
             Light.GREEN->"当前是绿灯，可以走了"
             Light.RED->"当前是红灯，不能走"
             Light.YELLOW->"当前是黄灯，可走可不走"
         }


    enum class Light{
        RED,YELLOW,GREEN
    }
    inline fun <reified T:Enum<T>> getName(){
        println(enumValues<T>().joinToString { it.name })
    }


    fun <T:CharSequence> getFanXing(list:List<T>){
        list.forEach(){
            println("当前的元素是${it}")
        }
    }

    fun getCar(sealedDemo:SealedDemo) { when(sealedDemo){
            is SealedDemo.Car1 ->sealedDemo.drive()
            is SealedDemo.Car2 ->sealedDemo.drive()
        }
    }

    fun <T> copyWhenGreater(list:List<T>,threshold:T):List<String>
      where T:CharSequence,T:Comparable<T>{
          return list.filter { it>threshold }.map { it.toString()}
      }



}