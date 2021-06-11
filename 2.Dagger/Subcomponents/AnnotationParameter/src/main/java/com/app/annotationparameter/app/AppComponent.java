package com.app.annotationparameter.app;

import com.app.annotationparameter.activity.ActivityModule;

import dagger.Component;

@Component(modules = {AppModule.class, ActivityModule.class})
public interface AppComponent {
    @Component.Factory
    interface Factory {
        AppComponent create();
    }

    void inject (App app);
}
