package com.app.componenttypes;

import com.app.componenttypes.A;
import com.app.componenttypes.B;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule2 {
    Integer b;

    public AppModule2(Integer b) {
        this.b = b;
    }

    @Provides
    public B provideB(){
        return new B(b);
    }
}
