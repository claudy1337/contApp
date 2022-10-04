package com.example.contactcompact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logo.alpha = 0F
        appname.alpha = 0F
        appname.animate().setDuration(1500).alpha(1f)
        logo.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent = Intent(this, authentation::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}