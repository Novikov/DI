package com.app.custombuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    AppComponent appComponent;

    @Inject
    String firstInt;

    @Inject
    Simple simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appComponent = DaggerAppComponent.builder().firstInt(5).build();

        appComponent.inject(this);

        Log.i(TAG, "firstInt: " + firstInt);
        Log.i(TAG, "simple: " + simple.getInfo());
    }

    private static final String TAG = "MainActivity";
}