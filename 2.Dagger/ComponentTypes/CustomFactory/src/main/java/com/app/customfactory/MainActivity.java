package com.app.customfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    AppComponent appComponent;

    @Inject
    String firstString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * В данном случае мы сразу увидем ошибку если не передали нужные параметры
         * */

        appComponent = DaggerAppComponent
                .factory()
                .create(9,true);

        appComponent.inject(this);

        Log.i(TAG, "onCreate: "+firstString);
    }

    private static final String TAG = "MainActivity";
}