package com.example.livedatacommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {
    val liveData=MutableLiveData<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            liveData.value="Value is Updated"

        },1000)
    }
}
