package com.studykotlin.demo.`class`

import android.view.View

//密封类
sealed class SealedDemo {
    abstract fun drive()

    open class Car1:SealedDemo(){
       override fun drive(){
            println("密封类1")
        }

    }
    open class Car2:SealedDemo(){
       override fun drive(){
            println("密封类2")
        }
    }


}