package com.app.modifiedappactivityhierarchy.app;


import com.app.modifiedappactivityhierarchy.activity.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
