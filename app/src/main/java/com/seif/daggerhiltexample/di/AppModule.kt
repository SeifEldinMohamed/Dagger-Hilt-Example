package com.seif.daggerhiltexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // to scope this dependencies
object AppModule {

    @Singleton // this will make this string singleton ( only have one instance )
    @Provides // to tell dagger hilt that we want to provide a dependency
    @Named("string1") // to differentiate bet two strings dependencies
    fun provideTestString1() = "this is a string we will inject"

}
// this are containers for the dependencies that live specific amount of time
// we will define all dependencies that live as long as our application does
// ex: retrofit instance , room instance
// also we can have mainActivity module