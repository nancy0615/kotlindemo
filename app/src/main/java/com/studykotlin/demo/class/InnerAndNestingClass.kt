package com.studykotlin.demo.`class`

class InnerAndNestingClass {
    val toadyWeather:Int = 20
    var name:String? = null
   // var nestingClass: NestingClass? = null

    fun getNestintWeather():NestingClass?{
        var nestingClass1:NestingClass? = null
        return nestingClass1
    }

    inner class InnerClass(){
        fun getWeather():Int{  //内部类，可以调用外部类的成员变量
           // return toadyWeather
            return if(name==null) 20 else 22
        }
    }
    class NestingClass(){ //嵌套类不能调用外部类的成员变量
        fun nestingClassGetWeather(){
            println("嵌套类：今天的气温是20`c")
        }
    }

}