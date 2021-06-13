package com.app.appactivityfragmenthierarchymodified.app;



import com.app.appactivityfragmenthierarchymodified.activity.ActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
