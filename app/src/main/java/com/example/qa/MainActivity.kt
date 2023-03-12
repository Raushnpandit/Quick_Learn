package com.example.qa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity(){

    private lateinit var cardv: CardView
    private lateinit var cardv2: CardView
    private lateinit var cardv3: CardView
    private lateinit var cardv4: CardView
    private lateinit var cardv5: CardView
    private lateinit var cardv6: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // First card intent
        cardv = findViewById<CardView>(R.id.cardv)
        cardv.setOnClickListener {
            val intent = Intent(this@MainActivity, Physics::class.java)
            startActivity(intent)
        }

        // Second card intent
        cardv2 = findViewById<CardView>(R.id.cardv2)
        cardv2.setOnClickListener {
            val intent = Intent(this@MainActivity, Chemistry::class.java)
            startActivity(intent)
        }

        // Third card intent
        cardv3 = findViewById<CardView>(R.id.cardv3)
        cardv3.setOnClickListener {
            val intent = Intent(this@MainActivity, Biology::class.java)
            startActivity(intent)
        }

        // Fourth card intent
        cardv4 = findViewById<CardView>(R.id.cardv4)
        cardv4.setOnClickListener {
            val intent = Intent(this@MainActivity, Astronomy::class.java)
            startActivity(intent)
        }

        // Fifth card intent
        cardv5 = findViewById<CardView>(R.id.cardv5)
        cardv5.setOnClickListener {
            val intent = Intent(this@MainActivity, Social::class.java)
            startActivity(intent)
        }

        // Sixth card intent
        cardv6 = findViewById<CardView>(R.id.cardv6)
        cardv6.setOnClickListener {
            val intent = Intent(this@MainActivity, About::class.java)
            startActivity(intent)
        }


    }
}