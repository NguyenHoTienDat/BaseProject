package com.example.tiendat.androidbaseproject.utils

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.tiendat.androidbaseproject.data.source.local.LocalDataSourceImp
import com.example.tiendat.androidbaseproject.data.source.remote.RemoteDataSourceImp
import com.example.tiendat.androidbaseproject.data.source.repository.AppRepository
import com.example.tiendat.androidbaseproject.ui.screen.details.DetailViewModel
import com.example.tiendat.androidbaseproject.ui.screen.main.MainViewModel

class ViewModelFactory private constructor(
        private val application: Application,
        private val repository: AppRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            with(modelClass) {
                when {
                    isAssignableFrom(MainViewModel::class.java) ->
                        MainViewModel()
                    isAssignableFrom(DetailViewModel::class.java) ->
                        DetailViewModel()
                    else ->
                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            } as T

    companion object {
        private var INSTANCE: ViewModelFactory? = null

        fun getVmFactoryInstance(application: Application) = INSTANCE ?: ViewModelFactory(
                application, AppRepository.getInstance(RemoteDataSourceImp(), LocalDataSourceImp())
        )

        fun destroyVmFactoryInstance() {
            INSTANCE = null
        }
    }
}
