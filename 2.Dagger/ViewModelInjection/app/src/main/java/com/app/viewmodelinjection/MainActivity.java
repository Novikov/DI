package com.app.viewmodelinjection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.app.viewmodelinjection.di.ActivityComponent;
import com.app.viewmodelinjection.di.DaggerActivityComponent;
import com.app.viewmodelinjection.di.utils.ViewModelProviderFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    ActivityComponent activityComponent;

    MainViewModel mainViewModel;

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityComponent = DaggerActivityComponent.factory().create();
        activityComponent.inject(this);

        mainViewModel = ViewModelProviders.of(this,viewModelProviderFactory).get(MainViewModel.class);

        Log.i(TAG, mainViewModel.i.toString());

    }

    private static final String TAG = "MainActivity";
}