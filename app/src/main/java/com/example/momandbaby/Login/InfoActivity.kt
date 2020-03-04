package com.example.momandbaby.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.momandbaby.Contans
import com.example.momandbaby.R
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        btnStart.setOnClickListener {
            if (!validate())
            {
                Toast.makeText(this,"Bạn chưa nhập đủ thông tin",Toast.LENGTH_SHORT).show()
            }
            else{
                 val DuLieu = Contans(editText3.text.toString(),
                                      editText4.text.toString(),
                                      editText5.text.toString(),
                                      editText6.text.toString())
            }
        }
    }
    fun validate(): Boolean= editText3.text.isNullOrEmpty() ||
            editText4.text.isNullOrEmpty() ||
            editText5.text.isNullOrEmpty() ||
            editText6.text.isNullOrEmpty()
}
