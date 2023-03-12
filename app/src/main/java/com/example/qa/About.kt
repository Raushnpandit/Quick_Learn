package com.example.qa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class About : AppCompatActivity() {

    lateinit var facebook_icon : ImageView
    lateinit var linked_icon : ImageView
    lateinit var git_icon : ImageView
    lateinit var gmail_icon : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        facebook_icon = findViewById(R.id.facebook_icon)
        linked_icon = findViewById(R.id.linked_icon)
        git_icon = findViewById(R.id.git_icon)
        gmail_icon = findViewById(R.id.gmail_icon)

        facebook_icon.setOnClickListener {
            val facebook_icon = "https://www.facebook.com/lovely.roshan.98229/"
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(facebook_icon))
            startActivity(browserIntent)
        }

        linked_icon.setOnClickListener {
            val linked_icon = "https://www.linkedin.com/in/raushn-pandit-660b39250/"
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(linked_icon))
            startActivity(browserIntent)
        }

        git_icon.setOnClickListener {
            val git_icon = "https://github.com/Raushnpandit"
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(git_icon))
            startActivity(browserIntent)
        }

        gmail_icon.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("raushnpandit01@gmail.com"))
            startActivity(browserIntent)
        }



    }
}