package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = "MyApp"
        val editText : EditText = findViewById(R.id.editText)
        val buttonLog : Button = findViewById(R.id.button_log)
        buttonLog.setOnClickListener {
            Log.i(TAG, "From Edit Text: " + editText.text.toString())
        }

        Timber.plant(Timber.DebugTree())
        val buttonTimber : Button = findViewById(R.id.button_timber)
        buttonTimber.setOnClickListener {
          Timber.i(editText.text.toString())
        }

    }

}