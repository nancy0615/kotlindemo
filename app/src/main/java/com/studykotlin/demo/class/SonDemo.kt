package com.studykotlin.demo.`class`

class SonDemo(study:String) : ParentDemo(study) {
   constructor(age:Int,study: String) : this(study = "java") {
        println("我是子类构造函数，我今年${age}岁，在学习${study}")
    }
    override fun isDoWhat(study: String){
        println("我是子类，我在学${study}")
    }
}