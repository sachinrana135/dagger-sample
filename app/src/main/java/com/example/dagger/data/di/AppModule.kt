package com.example.dagger.data.di

import com.example.dagger.data.LoginRepository
import com.example.dagger.ui.login.LoginViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideViewModelFactory(loginRepository: LoginRepository) : LoginViewModelFactory {
        return  LoginViewModelFactory(loginRepository)
    }

}