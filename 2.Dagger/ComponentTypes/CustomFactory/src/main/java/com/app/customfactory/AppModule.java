package com.app.customfactory;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String provideInt(int firstInt){
        return String.valueOf(firstInt);
    }
}
