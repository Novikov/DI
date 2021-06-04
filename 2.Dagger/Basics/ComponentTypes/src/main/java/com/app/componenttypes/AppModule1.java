package com.app.componenttypes;

import com.app.componenttypes.A;
import com.app.componenttypes.B;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule1 {
    Integer a;

    public AppModule1(Integer a) {
        this.a = a;
    }

    @Provides
    public A provideA(){
        return new A(a);
    }
}
