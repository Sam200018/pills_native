package com.example.pills

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import java.util.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        timeSplash()
    }

    private fun timeSplash() {
        val timer = Timer()

        val currentUser = FirebaseAuth.getInstance().currentUser

        timer.schedule(object : TimerTask() {
            override fun run() {
                if(FirebaseAuth.getInstance().currentUser != null) {
                    val mainActivity = Intent(this@Splash, MainActivity::class.java)
                    startActivity(mainActivity)
                }else {
                    val login = Intent(this@Splash, Login::class.java)
                    startActivity(login)
                }

                finish()
            }
        }, 3000)
    }
}