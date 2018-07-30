package com.example.tiendat.androidbaseproject

import android.app.Application
import com.example.tiendat.androidbaseproject.data.source.remote.network.service.AppService

class ProjectApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        AppService.initAppService(this)
    }
}
