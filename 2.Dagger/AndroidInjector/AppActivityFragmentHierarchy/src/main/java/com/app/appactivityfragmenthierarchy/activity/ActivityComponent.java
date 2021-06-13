package com.app.appactivityfragmenthierarchy.activity;

import com.app.appactivityfragmenthierarchy.app.App;
import com.app.appactivityfragmenthierarchy.fragment.FragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {ActivityCustomModule.class, FragmentModule.class})
public interface ActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> { }
}
