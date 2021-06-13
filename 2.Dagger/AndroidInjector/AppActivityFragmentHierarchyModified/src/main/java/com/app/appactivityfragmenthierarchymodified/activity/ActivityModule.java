package com.app.appactivityfragmenthierarchymodified.activity;

import com.app.appactivityfragmenthierarchymodified.fragment.FragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {
    //Subcomponent генерится сам
    @ContributesAndroidInjector(modules = {ActivityCustomModule.class, FragmentModule.class})
    abstract MainActivity contributeYourAndroidInjector();
}

