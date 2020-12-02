package com.example.dagger.data.di

import android.app.Application
import com.example.dagger.ui.login.LoginActivity
import dagger.Component
import dagger.Module


@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject (activity: LoginActivity)

    fun inject(app: Application)

}