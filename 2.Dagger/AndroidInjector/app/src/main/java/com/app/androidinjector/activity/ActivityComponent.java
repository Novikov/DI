package com.app.androidinjector.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = ActivityCustomModule.class)
public interface ActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
}
