package com.studykotlin.demo.coroutine

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.studykotlin.demo.R
import kotlinx.coroutines.*

class CoroutineDemoActivity : AppCompatActivity() {

   private var textview:TextView? = null

    @SuppressLint("SetTextI18n","StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.textview)


        var button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
//                object : AsyncTask<Void, Void, User>() {
//                    override fun doInBackground(vararg params: Void?): User? {
//                        return userServiceApi.loadUser("xxxxx").execute().body()
//                    }
//
//                    override fun onPostExecute(user: User?) {
//                        super.onPostExecute(user)
//                        textview.text = "address:${user?.address}"
//                    }
//                }.execute()
                GlobalScope.launch(Dispatchers.Main) {
//                    val user = withContext(Dispatchers.IO){
//                        userServiceApi.loadUserCor("hahahha")
//                    }
//                    textview.text = "address:${user?.address}"
                    getUser()
                }
            }
        }
    }
    private suspend fun getUser(){
        val user:User = getData()
        show(user)
    }
    private suspend fun getData() = withContext(Dispatchers.IO){
                userServiceApi.loadUserCor("hahahha")
    }
    private fun show(user: User){
        textview?.text = "address:${user?.address}"
    }

}