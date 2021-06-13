package com.app.appactivityfragmenthierarchy.app;

import com.app.appactivityfragmenthierarchy.activity.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
