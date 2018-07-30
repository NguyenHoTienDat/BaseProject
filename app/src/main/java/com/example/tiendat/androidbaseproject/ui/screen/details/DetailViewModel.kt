package com.example.tiendat.androidbaseproject.ui.screen.details

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.OnLifecycleEvent
import android.os.Handler
import com.example.tiendat.androidbaseproject.ui.base.viewmodel.BaseLoadViewModel

class DetailViewModel : BaseLoadViewModel() {

    //@inject Repository

    val dataDemo: MutableLiveData<String> = MutableLiveData()

    init {
        isDataLoading.value = true
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onActivityStarted() {
        //use repo to get data or something else to start screen
        getDataFromRepoDemo()
    }

    private fun getDataFromRepoDemo() {
        Handler().postDelayed(Runnable {
            dataDemo.value = "data after loading"
            isDataLoading.value = false
        }, 3000)
    }
}