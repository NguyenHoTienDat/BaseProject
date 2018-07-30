package com.example.tiendat.androidbaseproject.ui.base.viewmodel

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel(), LifecycleObserver {
    val compoDisposable = CompositeDisposable()

    fun releaseRes() {
        compoDisposable.clear()
    }
}
