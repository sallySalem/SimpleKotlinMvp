package com.example.simplekotlinmvp.ui.splash

import android.os.Handler
import com.example.simplekotlinmvp.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by sally on 6/19/17.
 */
class SplashPresenter @Inject constructor() : BasePresenter<SplashView>() {
    val SPLASH_TIME: Long = 3000
    fun initialize() {
        Handler().postDelayed({ view?.navigateToRepositoriesListScreen() }, SPLASH_TIME)
    }

}