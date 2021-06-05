package com.app.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val str: String by inject()
    private val value: Integer by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: $str")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.i(TAG, "button $value")
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}