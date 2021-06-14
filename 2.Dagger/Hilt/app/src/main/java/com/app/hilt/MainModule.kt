package com.app.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class MainModule {

    @Provides
    fun provideString():String{
        return "String from main module"
    }

    @Provides
    fun provideInteger(): Int {
        return 5
    }
}