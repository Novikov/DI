package com.app.annotationparameter.app;

import com.app.annotationparameter.activity.ActivityComponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module (subcomponents = ActivityComponent.class)
public class AppModule {
    @Provides
    @Named("app string")
    String provideStringFromFragment(){
        return "app string";
    }
}
