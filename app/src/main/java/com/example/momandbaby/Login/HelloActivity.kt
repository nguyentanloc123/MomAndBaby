package com.example.momandbaby.Login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog
import com.example.momandbaby.Main.MainActivity
import com.example.momandbaby.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_hello.*


class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val gso =
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()
        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        btnLogin.setOnClickListener(
            {
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }

        )
        btnLoginGoogle.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, 1)

        }
        btnReg.setOnClickListener {
            startActivity(Intent(this,RegActivity::class.java))
            finish()
        }
        btnExit.setOnClickListener {
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

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === 1) { // The Task returned from this call is always completed, no need to attach
// a listener.
            val task =
                GoogleSignIn.getSignedInAccountFromIntent(data)
                handleSignInResult(task)
        }
    }
    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account =
                completedTask.getResult(ApiException::class.java)
            Log.d("acc",account.toString())
            val intent = Intent(this,InfoActivity::class.java)
            startActivity(intent)
            finish()
            // Signed in successfully, show authenticated UI.

        } catch (e: ApiException) { // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w("1111","signInResult:failed code=" + e.statusCode)
           // updateUI(null)
        }
    }
    fun updateUI(account: GoogleSignInAccount?) {
        if (account != null) {
            startActivity(Intent(this,MainActivity::class.java))
        } else {

        }
    }

    override fun onStart() {
        super.onStart()
        val account = GoogleSignIn.getLastSignedInAccount(this)
        updateUI(account)
    }

}
