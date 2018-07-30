package com.example.tiendat.androidbaseproject.data.source.remote.network.service

import android.app.Application
import com.example.tiendat.androidbaseproject.data.source.remote.network.RetrofitHelper
import com.example.tiendat.androidbaseproject.data.source.remote.network.api.AppApi
import io.reactivex.annotations.NonNull

object AppService {

    private const val BASE_URL = "https://min-api.cryptocompare.com/data/"
    private lateinit var appApi: AppApi

    fun initAppService(@NonNull app: Application) {
        appApi = RetrofitHelper.createService(app, BASE_URL, AppApi::class.java)
    }

    fun getBitcoinApiInstance(): AppApi = if (appApi != null) appApi
    else throw RuntimeException("Need call method ServiceClient#initialize() first")
}
