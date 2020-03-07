package com.example.momandbaby.Login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.momandbaby.Contans
import com.example.momandbaby.Main.MainActivity
import com.example.momandbaby.R
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)


        val sharedPref = getSharedPreferences(
            getString(R.string.srf), Context.MODE_PRIVATE)

        btnStart.setOnClickListener {
            if (validate())
            {
                Toast.makeText(this,"Bạn chưa nhập đủ thông tin",Toast.LENGTH_SHORT).show()
            }
            else if (!validatenum())
            {
                Toast.makeText(this,"Tuần dự kiến phải lớn hơn tuần hiện tại hoặc số tuần phải lớn hơn 0 hoặc bé hơn 41",Toast.LENGTH_SHORT).show()

            }
            else{




                with(sharedPref.edit()){
                    putString("tenme",editText3.text.toString())
                    putString("tenbe",editText4.text.toString())
                    putInt("tuanhientai",convertString(editText5.text.toString()))
                    putInt("tuandukien",convertString(editText6.text.toString()))
                    commit()
                }
                val intent: Intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        btnExit.setOnClickListener {
            startActivity(Intent(this,HelloActivity::class.java))
        }
    }
    fun validate(): Boolean= editText3.text.isNullOrEmpty() ||
            editText5.text.isNullOrEmpty() ||
            editText6.text.isNullOrEmpty()

    fun validatenum(): Boolean = (convertString(editText5.text.toString())>=1 && convertString(editText5.text.toString())<=40)
            && (convertString(editText6.text.toString())>=2 && convertString(editText6.text.toString())<=40)
            && (convertString(editText6.text.toString()) > convertString(editText5.text.toString()))

    override fun onStop() {
        super.onStop()
        finish()
    }
    fun convertString(text:String): Int {
        val temptext = text.toString()
        val tuanhientai: Int = temptext.toInt()
        return tuanhientai
    }

}
