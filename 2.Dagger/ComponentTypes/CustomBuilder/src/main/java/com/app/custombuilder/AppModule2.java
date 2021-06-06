package com.app.custombuilder;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule2 {

    //Более оптимизированный способ предоставления зависимостей
    @Binds
    abstract Simple bindA(A a);

}
