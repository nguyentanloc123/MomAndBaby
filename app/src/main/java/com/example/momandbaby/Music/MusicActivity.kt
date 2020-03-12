package com.example.momandbaby.Music

class MusicActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}

