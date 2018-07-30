package com.example.tiendat.androidbaseproject.ui.base.viewmodel

import android.arch.lifecycle.MutableLiveData

abstract class BaseLoadViewModel: BaseViewModel() {

    val isDataLoading: MutableLiveData<Boolean> = MutableLiveData()
}