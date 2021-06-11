package com.app.subcomponents;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @Provides
    String provideString(){
    return "String from activity module";
    }
}
