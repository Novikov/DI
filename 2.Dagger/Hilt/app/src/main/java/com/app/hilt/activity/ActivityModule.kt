package com.app.hilt.activity

import com.app.hilt.activity.ActivityString
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {
    @ActivityString
    @Provides
    fun provideString():String{
        return "String from activity module"
    }
}