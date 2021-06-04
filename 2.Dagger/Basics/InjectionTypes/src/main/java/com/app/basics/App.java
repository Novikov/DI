package com.app.basics;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

public class App extends Application {
    private AppComponent component;

    @Inject
    String providedString;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().build();
        component.inject(this);
        Log.i(TAG, "property injection in App: " + providedString);
    }

    private static final String TAG = "App";
}
