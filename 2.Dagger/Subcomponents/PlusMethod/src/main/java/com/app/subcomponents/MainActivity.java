package com.app.subcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    AppComponent appComponent;
    ActivityComponent activityComponent;

    @Inject
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appComponent = DaggerAppComponent.factory().create();
        activityComponent = appComponent.plusActivityComponent().create();

        activityComponent.inject(this);

        Log.i(TAG, "injected String - " + str);
    }

    private static final String TAG = "MainActivity";
}