package com.example.bakudan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red.setOnClickListener { onBakudanButtonTapped(it) }
        blue.setOnClickListener { onSuccessButtonTapped(it) }
    }

    fun onBakudanButtonTapped(view: View){
        val intent = Intent(this,FailureActivity::class.java)
        startActivity(intent)

    }

    fun onSuccessButtonTapped(view: View){
        val intent = Intent(this,SuccessActivity::class.java)
        startActivity(intent)
    }
}
