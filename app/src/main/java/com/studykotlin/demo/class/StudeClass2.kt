package com.studykotlin.demo.`class`

class StudeClass2 {
    lateinit var study :String
    fun getStudyData():Int{
        println("getStudyData==============${study}")
        return if (study=="nancy") 12 else 34
    }
     val age by lazy (){
         32
     }


}