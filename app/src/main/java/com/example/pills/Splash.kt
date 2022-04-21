package com.example.pills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        timeSplash()
    }

    private fun timeSplash() {
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                val mainActivity = Intent(this@Splash, MainActivity::class.java)
                startActivity(mainActivity)
                finish()
            }
        }, 3000)
    }
}