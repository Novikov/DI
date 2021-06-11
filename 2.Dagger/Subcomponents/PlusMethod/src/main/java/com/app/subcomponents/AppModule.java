package com.app.subcomponents;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    Integer provideInt(){
        return 1;
    }
}
