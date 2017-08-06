package com.example.simplekotlinmvp.ui.home

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.simplekotlinmvp.R
import com.example.simplekotlinmvp.SimpleKotlinApp
import com.example.simplekotlinmvp.ui.base.BaseActivity
import com.example.simplekotlinmvp.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by sally on 6/19/17.
 */
class HomeActivity : BaseActivity(), HomeView {
    override fun initialize(bundle: Bundle?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    @Inject
    lateinit var homePresenter : HomePresenter

    companion object {
        fun open(activity: Activity) {
            val intent = Intent(activity, HomeActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun initializePresenter() {
        super.presenter = homePresenter
        homePresenter.view = this
    }

    override fun initializeDagger() {
        val app = application as SimpleKotlinApp
        app.appComponent?.inject(this)
    }

    override var layoutId: Int = R.layout.activity_home

}