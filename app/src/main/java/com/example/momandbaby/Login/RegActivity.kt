package com.example.momandbaby.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.momandbaby.R
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.activity_reg.*
import java.util.concurrent.TimeUnit

class RegActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        btnExit.setOnClickListener {
            startActivity(Intent(this,HelloActivity::class.java))
        }
        btnLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }


    }
}
