package com.studykotlin.demo.coroutine

import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

data class User(val name:String,val address:String)

val userServiceApi: UserServiceApi by lazy{
    val retrofit = retrofit2.Retrofit.Builder().client(OkHttpClient.Builder().addInterceptor
    {it.proceed(it.request().apply {
                    Log.e("===============","request:${this}")
         }
    ) }.build()).baseUrl("http://192.168.1.4:8080/kotlinstudyserver/").
    addConverterFactory(MoshiConverterFactory.create()).build()
    retrofit.create(UserServiceApi::class.java)
}

interface UserServiceApi {
    @GET("user")
    fun loadUser(@Query("name") name:String): Call<User>

    //协程
    @GET("user")
    suspend fun loadUserCor(@Query("name") name:String): User
}