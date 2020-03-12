package com.example.momandbaby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.momandbaby.Main.MainActivity
import kotlinx.android.synthetic.main.activity_info_mom.*

class InfoMomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_mom)
        val anim: Animation= AnimationUtils.loadAnimation(this,R.anim.fade_right)
        sub1.startAnimation(anim)
        imgsub2.startAnimation(anim)
        txtsub3.startAnimation(anim)
        txtmom.startAnimation(anim)
        val loikhuyen: String= intent.getStringExtra("thongtinme")
        txtmom.text= loikhuyen
        sub1.setOnClickListener{
            val intent: Intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
