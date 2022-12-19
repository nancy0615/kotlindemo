package com.studykotlin.demo.coroutine

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.*

class MainScopeDemoActivity : AppCompatActivity(),CoroutineScope by MainScope() {
   // private val mainScope = MainScope()
    private var textview:TextView? = null

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.textview)


       findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
//               mainScope.launch {
////                   val user = userServiceApi.loadUserCor("hahahha")
////                   textview?.text = "address:${user.address}"
//
//                   try {
//                       delay(10000)
//                   }catch (exception:Exception){
//                       exception.printStackTrace()
//                   }
//               }

              launch {
                   val user = userServiceApi.loadUserCor("hahahha")
                   textview?.text = "address:${user.address}"
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
      //  mainScope.cancel()
        cancel()
    }

}