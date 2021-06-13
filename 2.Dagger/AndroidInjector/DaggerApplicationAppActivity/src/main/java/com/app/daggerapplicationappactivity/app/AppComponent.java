package com.app.daggerapplicationappactivity.app;

import com.app.daggerapplicationappactivity.activity.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
