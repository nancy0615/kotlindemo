package com.studykotlin.demo.`class`

data class DataDemo(val str:String,var index:Int): DataInterface {
    override fun getStr() {
        println("我是实现接口中的方法=====getStr=======${str}")
    }

    override fun getData(){
        println("我是实现接口中的方法=====getData=======${str}")
    }
}