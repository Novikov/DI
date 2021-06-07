package com.app.component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin {
            modules(dataModule)
        }
        val component = MyComponent()
        Log.i(TAG, "onCreate: ${component.first}")
        Log.i(TAG, "onCreate: ${component.second}")

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}