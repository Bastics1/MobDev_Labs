package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText : EditText = findViewById(R.id.editText)
        val buttonSetBlackText : Button = findViewById(R.id.buttonSetBlackText)
        buttonSetBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        val buttonSetRedText : Button = findViewById(R.id.buttonSetRedColorText)
        buttonSetRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        val buttonSetTextSize85 : Button = findViewById(R.id.buttonSetSizeText85)
        buttonSetTextSize85.setOnClickListener {
            editText.setTextSize(8f)
        }

        val buttonSetTextSize245 : Button = findViewById (R.id.buttonSetSizeText245)
        buttonSetTextSize245.setOnClickListener {
            editText.setTextSize(24f)
        }

        val buttonSetWhiteBackground : Button = findViewById(R.id.buttonSetWhiteBackground)
        buttonSetWhiteBackground.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        val buttonSetYellowBackground : Button = findViewById(R.id.buttonSetYellowBackground)
        buttonSetYellowBackground.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}