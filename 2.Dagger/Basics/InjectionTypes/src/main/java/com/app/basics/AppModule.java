package com.app.basics;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    String provideString(){
        return "Hello";
    }
}
