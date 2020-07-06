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

        //「赤」のボタンが押されると onBakudanButtonTappedメソッドを呼び出す
        red.setOnClickListener { onBakudanButtonTapped(it) }
        //「青」のボタンが押されると onSuccessButtonTappedメソッドを呼び出す
        blue.setOnClickListener { onSuccessButtonTapped(it) }
    }

    //解除失敗の画面に遷移する処理
    fun onBakudanButtonTapped(view: View){
        val intent = Intent(this,FailureActivity::class.java)
        startActivity(intent)

    }
    //解除成功！の画面に遷移する処理
    fun onSuccessButtonTapped(view: View){
        val intent = Intent(this,SuccessActivity::class.java)
        startActivity(intent)
    }
}
