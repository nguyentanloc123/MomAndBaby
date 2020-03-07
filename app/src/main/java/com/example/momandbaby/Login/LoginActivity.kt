package com.example.momandbaby.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.momandbaby.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener(
            {
                var intent = Intent(this, InfoActivity::class.java)
                startActivity(intent)
                finish()
            }
        )
        btnExit.setOnClickListener {
            startActivity(Intent(this,HelloActivity::class.java))
        }
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}
