package com.app.androidinjector.app;

import com.app.androidinjector.activity.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
