package com.example.interactiveapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRed = findViewById<Button>(R.id.btnRed)
        val buttonWhite = findViewById<Button>(R.id.btnWhite)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        buttonRed.setOnClickListener {
            // Change to Light mode
            layout.setBackgroundResource(R.color.red)
        }
        buttonDark.setOnClickListener {
            // Change to Light mode
            layout.setBackgroundResource(R.color.black)
        }
        buttonWhite.setOnClickListener {
            // Change to Light mode
            layout.setBackgroundResource(R.color.white
            )
        }
    }
}