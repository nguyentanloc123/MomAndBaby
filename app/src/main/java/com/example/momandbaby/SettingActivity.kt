package com.example.momandbaby

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog
import com.example.momandbaby.Login.HelloActivity
import com.example.momandbaby.Main.MainActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.OnCompleteListener
import kotlinx.android.synthetic.main.setting_item_container.*



class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting_item_container)
        val sharedPref = getSharedPreferences(
            getString(R.string.srf), Context.MODE_PRIVATE)
        val tuanhientai= sharedPref.getInt("tuanhientai",5)
        edttuanhientai.setText(tuanhientai.toString())
        edttuandukien.setText(sharedPref.getInt("tuandukien",40).toString())
        edtmom.setText(sharedPref.getString("tenme","Mẹ").toString())
        edtbaby.setText(sharedPref.getString("tenbe","Bé").toString())


        btnThoat.setOnClickListener {
            TTFancyGifDialog.Builder(this)
                 .setTitle("Thoát")
                 .setMessage("Bạn có muốn thoát ứng dụng")
                 .setNegativeBtnBackground("#00E676")
                 .setPositiveBtnBackground("#CCCCCC")
                 .setPositiveBtnText("OK")
                 .setNegativeBtnText("Không")
                 .setGifResource(R.drawable.exitgif)
                 .isCancellable(true)
                 .OnPositiveClicked {
                     System.exit(1)
                     finish()
                 }
                 .OnNegativeClicked {

                 }
                .build()
        }
        val intent: Intent= Intent(this,MainActivity::class.java)

        btnExit.setOnClickListener {
            startActivity(intent)
        }
        btnStart.setOnClickListener {
            with(sharedPref.edit()){
                putString("tenme",edtmom.text.toString())
                putString("tenbe",edtbaby.text.toString())
                putInt("tuanhientai",convertString(edttuanhientai.text.toString()))
                putInt("tuandukien",convertString(edttuandukien.text.toString()))
                commit()

                startActivity(intent)
            }
        }

        val gso =
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()
        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        btnLogout.setOnClickListener {
            mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, OnCompleteListener<Void?> {
                        Toast.makeText(this,"Bạn đã đăng xuất",Toast.LENGTH_SHORT).show()
                    val intentmain: Intent= Intent(this, HelloActivity::class.java)
                    startActivity(intentmain)
                    val editor: SharedPreferences.Editor = sharedPref.edit()
                    editor.clear();
                    editor.apply();
                    finish()
                })
        }
    }
    fun convertString(text:String): Int {
        val temptext = text.toString()
        val tuanhientai: Int = temptext.toInt()
        return tuanhientai
    }

}
