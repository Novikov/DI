package com.app.daggerapplicationappactivity.app;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {
    //Важно сделать правильный импорт dagger.android.support.DaggerApplication

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);
        return appComponent;
    }
}
