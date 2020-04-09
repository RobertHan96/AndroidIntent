package com.nexon.androidintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
    }

    fun setupEvents() {
        dialBtn.setOnClickListener {
//      안드로이드 기본 인텐트를 쓸때는 Intent가 아닌 Uri를 이용해서 접근
        val myUri = Uri.parse("tel:01022345619")
        val myIntent = Intent(Intent.ACTION_DIAL, myUri)
        startActivity(myIntent)
        }
    }
}
