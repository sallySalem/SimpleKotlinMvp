package com.example.simplekotlinmvp.ui.base

import android.os.Bundle

/**
 * Created by sally on 6/19/17.
 */
open abstract class BasePresenter<T : BaseView> {

    var view: T? = null

    open fun initialize(extras: Bundle?) {}
}