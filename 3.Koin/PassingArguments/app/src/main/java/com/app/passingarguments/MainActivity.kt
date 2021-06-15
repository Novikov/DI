package com.app.passingarguments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin {
            androidLogger()
            modules(dataModule)
        }
        val a:A by inject()
        Log.i(TAG, a.number.toString())
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}