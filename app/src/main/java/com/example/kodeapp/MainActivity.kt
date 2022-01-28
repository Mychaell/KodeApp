package com.example.kodeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.secondTextTwo)
        val imageView = findViewById<ImageView>(R.id.imageTwo)
        val textView2 = findViewById<TextView>(R.id.secondText)

        textView.setOnClickListener {
            imageView.visibility = View.VISIBLE
            textView2.visibility = View.GONE
        }

        }
    }


