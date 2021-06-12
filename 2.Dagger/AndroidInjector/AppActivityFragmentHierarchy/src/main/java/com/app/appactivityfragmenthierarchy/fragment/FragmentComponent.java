package com.app.appactivityfragmenthierarchy.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = FragmentCustomModule.class)
public interface FragmentComponent extends AndroidInjector<BlankFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BlankFragment> {}
}
