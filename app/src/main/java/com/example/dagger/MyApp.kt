package com.example.dagger

import android.app.Application
import com.example.dagger.data.di.AppComponent
import com.example.dagger.data.di.DaggerAppComponent

class MyApp : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {

        appComponent = DaggerAppComponent.create()

        appComponent.inject(this)

        super.onCreate()
    }
}