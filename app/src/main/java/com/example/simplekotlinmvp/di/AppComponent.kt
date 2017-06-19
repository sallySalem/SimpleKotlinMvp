package com.example.simplekotlinmvp.di

import com.example.simplekotlinmvp.ui.splash.SplashActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by sally on 6/19/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(splashActivity: SplashActivity)
}
