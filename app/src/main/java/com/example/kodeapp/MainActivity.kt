package com.example.kodeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityOpen = findViewById<TextView>(R.id.secondText)

        activityOpen.setOnClickListener {
            val intent = Intent(this, secondact::class.java)
            startActivity(intent)
        }

        }
    }


