package com.studykotlin.demo.coroutine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    val mutableUser = MutableLiveData<User>()
    fun getUser(name:String){
        viewModelScope.launch {
            mutableUser.value = UserRepository().getUser(name)
        }
    }
}