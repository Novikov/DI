package com.app.daggerapplicationappactivity.activity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityProviderModule {

    @ContributesAndroidInjector
    abstract MainActivity provideMainActivity();
}
