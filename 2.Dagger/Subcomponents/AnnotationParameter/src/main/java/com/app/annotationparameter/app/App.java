package com.app.annotationparameter.app;

import android.app.Application;

import com.app.annotationparameter.activity.ActivityComponent;

import javax.inject.Inject;


public class App extends Application {
    AppComponent appComponent;

    @Inject
    public ActivityComponent.Factory activityComponentFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create();
        appComponent.inject(this);
    }
}
