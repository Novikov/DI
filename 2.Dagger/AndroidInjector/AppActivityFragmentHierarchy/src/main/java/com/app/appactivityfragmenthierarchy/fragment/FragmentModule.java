package com.app.appactivityfragmenthierarchy.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentComponent.class)
public abstract class FragmentModule {
    @Binds
    @IntoMap
    @ClassKey(BlankFragment.class)
    abstract AndroidInjector.Factory<?>
    bindYourFragmentInjectorFactory(FragmentComponent.Factory factory);
}
