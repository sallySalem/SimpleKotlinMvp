package com.example.simplekotlinmvp.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.simplekotlinmvp.R
import com.example.simplekotlinmvp.SimpleKotlinApp
import com.example.simplekotlinmvp.ui.base.BaseActivity
import com.example.simplekotlinmvp.ui.home.HomeActivity
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {
    override fun navigateToRepositoriesListScreen() {
        HomeActivity.open(this)
        finish()
    }

    @Inject
    lateinit var splashPresenter: SplashPresenter

    override fun initialize(bundle: Bundle?) {
        splashPresenter.initialize()
    }

    override fun initializeDagger() {
        val app = application as SimpleKotlinApp
        app.appComponent?.inject(this)
    }

    override fun initializePresenter() {
        super.presenter = splashPresenter
        splashPresenter.view = this
    }

    override var layoutId: Int = R.layout.activity_splash
}
