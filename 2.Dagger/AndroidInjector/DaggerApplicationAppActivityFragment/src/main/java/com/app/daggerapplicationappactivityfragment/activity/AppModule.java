package com.app.daggerapplicationappactivityfragment.activity;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    String provideString(){
        return "string from app module";
    }
}
