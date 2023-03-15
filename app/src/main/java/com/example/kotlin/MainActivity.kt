package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SAM
        // Single Abstract Method
        // 추상메소드를 lambda 로 대체가 가능하다
        val view = View(this)

        view.setOnClickListener({
            println("SAM")
        })
        view.setOnClickListener {  }
    }
}