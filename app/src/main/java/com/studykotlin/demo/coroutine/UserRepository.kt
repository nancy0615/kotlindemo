package com.studykotlin.demo.coroutine

class UserRepository {
    suspend fun getUser(name:String):User{
       return  userServiceApi.loadUserCor(name)
    }
}