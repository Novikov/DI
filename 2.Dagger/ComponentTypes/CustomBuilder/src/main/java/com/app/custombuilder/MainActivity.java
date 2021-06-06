package com.app.custombuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    AppComponent appComponent;

    @Inject
    String firstString;

    @Inject
    Simple simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Мы можем забывать вызвать все методы и приложение упадет.
         * Idea нам никак не подскажет что мы забыли вызвать.
         * Вот почему нужно использовать Factory вместо Builder.
         * */

        appComponent = DaggerAppComponent.builder()
                .firstInt(5)
                .firstBool(true)
                .build();

        appComponent.inject(this);

        Log.i(TAG, "firstInt: " + firstString);
        Log.i(TAG, "simple: " + simple.getInfo());
    }

    private static final String TAG = "MainActivity";
}