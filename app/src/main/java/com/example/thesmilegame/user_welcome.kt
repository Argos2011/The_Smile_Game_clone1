package com.example.thesmilegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class user_welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_welcome)

        didclickMainMenuButton()
        didclickContinueButton()
        didclickNewGameButton()
    }

    fun didclickMainMenuButton() {
        val mainmenuBtn = findViewById<ImageButton>(R.id.btnMainMenu_UserWelcome)

        mainmenuBtn.setOnClickListener {
            val intent = Intent(this@user_welcome, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun didclickContinueButton() {
        val continueBtn = findViewById<ImageButton>(R.id.btnContinue_UserWelcome)

        continueBtn.setOnClickListener {
            val intent = Intent(this@user_welcome, gameplay::class.java)
            startActivity(intent)
        }
    }

        fun didclickNewGameButton() {
            val newgameBtn = findViewById<ImageButton>(R.id.btnNewGame_UserWelcome)

            newgameBtn.setOnClickListener {
                val intent = Intent(this@user_welcome, gameplay::class.java)
                startActivity(intent)
            }
        }
}