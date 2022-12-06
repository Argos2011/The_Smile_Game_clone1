package com.example.thesmilegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        didClickMainMenuButton()
    }

    fun didClickMainMenuButton() {
        val mainmenuBtn = findViewById<ImageButton>(R.id.btnMainMenu_signup)

        mainmenuBtn.setOnClickListener {
            val intent = Intent(this@signup, MainActivity::class.java)
            startActivity(intent)
        }
    }
}