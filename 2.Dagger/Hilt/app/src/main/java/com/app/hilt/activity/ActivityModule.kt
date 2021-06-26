package com.app.hilt.activity

import android.content.Context
import com.app.hilt.R
import com.app.hilt.activity.ActivityString
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {
    @ActivityString
    @Provides
    fun provideString(@ActivityContext context: Context):String{
        return "String from activity module" + context.resources.getString(R.string.test_string)
    }
}