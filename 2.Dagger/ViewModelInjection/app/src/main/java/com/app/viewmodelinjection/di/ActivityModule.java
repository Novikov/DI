package com.app.viewmodelinjection.di;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @Provides
    Integer provideInteger() {
        return 5;
    }
}
