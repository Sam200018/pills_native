package com.example.pills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signUp()
    }

    private fun signUp() {
        val goToSignUpButton: Button= findViewById(R.id.go_to_signup)
        goToSignUpButton.setOnClickListener {
            val signUp= Intent(this,SingUp::class.java)
            startActivity(signUp)
        }
    }
}