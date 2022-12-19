package com.studykotlin.demo.`class`

class StudeClass1 constructor(str:String) {
    var study  = "kotlin"
    var name:String = str
    var age:Int = 32
    init {
        val strSpace:String = str
        println("init:name================${strSpace},study ${study}")
    }

    constructor(name:String,age:Int) :this(name){
       println("constructor:name================"+name+",age============"+age)
    }
    fun getStudyData(){
        println("getStudyData:name================"+name+",age============"+age)
    }



}