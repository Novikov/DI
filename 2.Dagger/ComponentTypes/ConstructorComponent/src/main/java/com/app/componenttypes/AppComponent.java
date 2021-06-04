package com.app.componenttypes;

import dagger.Component;

@Component(modules = {AppModule1.class, AppModule2.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
