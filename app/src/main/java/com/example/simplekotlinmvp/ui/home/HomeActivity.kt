package com.example.simplekotlinmvp.ui.home

import android.app.Activity
import android.content.Intent
import com.example.simplekotlinmvp.R
import com.example.simplekotlinmvp.SimpleKotlinApp
import com.example.simplekotlinmvp.ui.base.BaseActivity
import com.example.simplekotlinmvp.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by sally on 6/19/17.
 */
class HomeActivity : BaseActivity(), HomeView {
    @Inject
    lateinit var homePresenter : HomePresenter

    companion object {
        fun open(activity: Activity) {
            val intent = Intent(activity, HomeActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override var presenter: BasePresenter<*>?
    get() = super.presenter
    set(value) {homePresenter}

    override fun initializeDagger() {
        val app = application as SimpleKotlinApp
        app.appComponent?.inject(this)
    }

    override fun initializePresenter() {
        homePresenter.view = this;
    }

    override var layoutId: Int = R.layout.activity_home

}