package com.app.passingarguments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin {
            androidLogger()
            modules(dataModule)
        }
        val a:A by inject{parametersOf(77)}
        Log.i(TAG, a.number.toString())
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}