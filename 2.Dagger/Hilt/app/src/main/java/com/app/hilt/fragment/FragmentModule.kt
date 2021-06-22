package com.app.hilt.fragment

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class FragmentModule {
    @FragmentString
    @Provides
    fun provideString():String{
        return "String from fragment module"
    }
}