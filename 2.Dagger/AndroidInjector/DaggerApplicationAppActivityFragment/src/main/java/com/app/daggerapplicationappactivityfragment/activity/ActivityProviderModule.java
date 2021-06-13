package com.app.daggerapplicationappactivityfragment.activity;

import com.app.daggerapplicationappactivityfragment.fragment.FragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityProviderModule {

    @ContributesAndroidInjector(modules = {FragmentModule.class})
    abstract MainActivity provideMainActivity();
}
