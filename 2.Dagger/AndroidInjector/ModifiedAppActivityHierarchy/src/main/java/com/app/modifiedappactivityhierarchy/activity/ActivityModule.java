package com.app.modifiedappactivityhierarchy.activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityModule {
    //Subcomponent генерится сам
    @ContributesAndroidInjector(modules = {ActivityCustomModule.class})
    abstract MainActivity contributeYourAndroidInjector();
}

