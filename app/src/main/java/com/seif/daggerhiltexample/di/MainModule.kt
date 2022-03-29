package com.seif.daggerhiltexample.di

import android.content.Context
import com.seif.daggerhiltexample.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class) // to scope this dependencies
object MainModule {

   // @Singleton // work only with application component "equivalent -> activityScoped
    @ActivityScoped
    @Provides // to tell dagger hilt that we want to provide a dependency
    @Named("string2")
    fun provideTestString2(
       @ApplicationContext context :Context,
       @Named("string1") testString1: String // to use other dependency created before
    ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}
// this are containers for the dependencies that live specific amount of time
// we will define all dependencies that live as long as our application does
// ex: retrofit instance , room instance
// also we can have mainActivity module