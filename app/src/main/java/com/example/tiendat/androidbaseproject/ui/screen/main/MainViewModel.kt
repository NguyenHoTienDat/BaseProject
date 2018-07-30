package com.example.tiendat.androidbaseproject.ui.screen.main

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.OnLifecycleEvent
import com.example.tiendat.androidbaseproject.ui.base.viewmodel.BaseViewModel

class MainViewModel : BaseViewModel() {

    //@inject Repository

    val dataDemo: MutableLiveData<String> = MutableLiveData()

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onActivityStarted() {
        //use repo to get data or something else to start screen
        getDataFromRepoDemo()
    }

    private fun getDataFromRepoDemo() {
        dataDemo.value = "Get Data Successed"
    }
}
