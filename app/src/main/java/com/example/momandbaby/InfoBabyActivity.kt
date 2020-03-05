package com.example.momandbaby

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Display
import androidx.appcompat.app.AppCompatActivity
import com.example.momandbaby.Main.MainActivity
import kotlinx.android.synthetic.main.activity_info_baby.*


class InfoBabyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_baby)
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        val thongtinbe: String = intent.getStringExtra("thongtinbe")
        txtbaby.text= thongtinbe
        val danhmuchinh: Int =  intent.getIntExtra("danmuchinh",1)
      //  val textt= "R.drawble.t1"
        //val drawable = resources.getDrawable(danhmuchinh)
          imgbaby.setImageResource(danhmuchinh)
        sub1.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
