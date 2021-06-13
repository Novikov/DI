package com.app.daggerapplicationappactivityfragment.activity;

import android.os.Bundle;
import android.util.Log;


import com.app.daggerapplicationappactivityfragment.R;
import com.app.daggerapplicationappactivityfragment.fragment.BlankFragment;

import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    @Inject
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, new BlankFragment())
                    .commit();
        }
        Log.i(TAG, str);
    }

    private static final String TAG = "MainActivity";
}