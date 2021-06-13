package com.app.daggerapplicationappactivity.app;

import com.app.daggerapplicationappactivity.activity.ActivityProviderModule;
import com.app.daggerapplicationappactivity.activity.AppModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

@Component(modules = {AndroidSupportInjectionModule.class, ActivityProviderModule.class, AppModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication>{}
