package com.app.appactivityfragmenthierarchymodified.fragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {
    @ContributesAndroidInjector(modules = {FragmentCustomModule.class})
    abstract BlankFragment contributeYourAndroidInjector();
}
