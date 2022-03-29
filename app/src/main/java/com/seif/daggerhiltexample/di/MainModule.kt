package com.seif.daggerhiltexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
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
    fun provideTestString2() = "this is a string we will inject as well"
}
// this are containers for the dependencies that live specific amount of time
// we will define all dependencies that live as long as our application does
// ex: retrofit instance , room instance
// also we can have mainActivity module