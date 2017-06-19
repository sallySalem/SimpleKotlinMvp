package com.example.simplekotlinmvp

import android.app.Application
import com.example.simplekotlinmvp.di.AppComponent
import com.example.simplekotlinmvp.di.DaggerAppComponent

/**
 * Created by sally on 6/19/17.
 */
class SimpleKotlinApp : Application() {
    var appComponent: AppComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}