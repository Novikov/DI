package com.app.modifiedappactivityhierarchy.activity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {
    //Subcomponent генерится сам
    @ContributesAndroidInjector(modules = {ActivityCustomModule.class})
    abstract MainActivity contributeYourAndroidInjector();
}

