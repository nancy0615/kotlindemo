package com.studykotlin.demo.`class`

open class ParentDemo{
    constructor(study:String){
        println("我是父类构造函数，我在学${study}")
    }
    open fun isDoWhat(study:String){
        println("我是父类，我在学${study}")
    }
}