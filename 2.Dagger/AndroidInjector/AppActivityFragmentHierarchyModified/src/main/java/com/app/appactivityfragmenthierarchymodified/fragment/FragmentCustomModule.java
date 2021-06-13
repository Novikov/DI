package com.app.appactivityfragmenthierarchymodified.fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentCustomModule {
    @Provides
    int provideInt() {
        return 5;
    }
}
