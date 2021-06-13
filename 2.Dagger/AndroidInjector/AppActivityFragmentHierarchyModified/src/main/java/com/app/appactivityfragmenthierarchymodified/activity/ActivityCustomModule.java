package com.app.appactivityfragmenthierarchymodified.activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityCustomModule {
    @Provides
    String provideStringFromActivity(){
        return "String from activity";
    }
}
