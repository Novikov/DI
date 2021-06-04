package com.app.basics;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);
    void inject(MainActivity mainActivity);
}
