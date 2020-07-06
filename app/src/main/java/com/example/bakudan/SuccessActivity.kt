package com.example.bakudan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_success.*

class SuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        //「もう一度」ボタンが押されると、起動時画面に戻る処理
        backButton.setOnClickListener { finish() }
    }


}
