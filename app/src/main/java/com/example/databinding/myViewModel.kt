package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    var msg=MutableLiveData<String>()

    fun setmsg(msg:String){
        this.msg.value=msg
    }
}