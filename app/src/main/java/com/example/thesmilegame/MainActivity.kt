package com.example.thesmilegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        didClickLoginButton()
        didClickSignupButton()
    }

    fun didClickLoginButton() {
        val loginBtn = findViewById<ImageButton>(R.id.btnLogin)

        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, user_welcome::class.java)
            startActivity(intent)
        }
    }

    fun didClickSignupButton() {
        val signupBtn = findViewById<ImageButton>(R.id.btnSignup)

        signupBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, signup::class.java)
            startActivity(intent)
        }
    }
}