package com.example.qa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.RelativeLayout
import android.widget.TextView

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val relativeLayout = findViewById<RelativeLayout>(R.id.relative_layout)
        val textView = relativeLayout.findViewById<TextView>(R.id.text_view)


        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}