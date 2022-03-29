package com.seif.daggerhiltexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // to scope this dependencies
object AppModule {

    @Singleton // this will make this string singleton ( only have one instance )
    @Provides // to tell dagger hilt that we want to provide a dependency
    fun provideTestString() = "this is a string we will inject"
}
// this are containers for the dependencies that live specific amount of time
// we will define all dependencies that live as long as our application does
// ex: retrofit instance , room instance
// also we can have mainActivity module