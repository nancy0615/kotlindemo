package com.studykotlin.demo.coroutine

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.studykotlin.demo.R
import com.studykotlin.demo.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.*

class DataBindingDemoActivity : AppCompatActivity() {
    private var textview:TextView? = null
    private val mainViewModel:MainViewModel by viewModels()

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        dataBinding.viewmodel = mainViewModel
        dataBinding.lifecycleOwner = this
        textview = findViewById<TextView>(R.id.textview)

//      dataBinding.button.also {
//            it.setOnClickListener {
//                mainViewModel.getUser("hahhahha")
//            }
//        }
        dataBinding.button.setOnClickListener {
                mainViewModel.getUser("hahhahha")
            }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}