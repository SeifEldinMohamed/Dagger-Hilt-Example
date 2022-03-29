package com.seif.daggerhiltexample.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application()

// to make hilt generated some background classes for us