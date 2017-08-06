package com.example.simplekotlinmvp.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by sally on 6/19/17.
 */
abstract class BaseActivity : AppCompatActivity(), BaseView {
    open var presenter: BasePresenter<*>? = null

    protected abstract fun initializeDagger()

    protected abstract fun initializePresenter()

    protected abstract fun initialize(bundle: Bundle?)

    abstract var layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initializeDagger()
        initializePresenter()

        initialize(intent!!.extras)
    }
}