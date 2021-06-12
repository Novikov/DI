package com.app.appactivityfragmenthierarchy.activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityComponent.class)
public abstract class ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?>
    bindYourAndroidInjectorFactory(ActivityComponent.Factory factory);
}

