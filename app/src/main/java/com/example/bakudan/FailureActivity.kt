package com.example.bakudan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_failure.*

class FailureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_failure)


        //「もう一度」ボタンが押されると、起動時画面に戻る処理
        backButton2.setOnClickListener { finish() }
    }
}
