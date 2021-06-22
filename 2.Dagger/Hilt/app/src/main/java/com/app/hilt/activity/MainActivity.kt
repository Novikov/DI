package com.app.hilt.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.app.hilt.fragment.MainFragment
import com.app.hilt.activity.view_model.MainViewModel
import com.app.hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var a: A

    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, mainViewModel.dep.toString())
        Log.i(TAG, a.dependency)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, MainFragment::class.java, null)
                .commit()
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}