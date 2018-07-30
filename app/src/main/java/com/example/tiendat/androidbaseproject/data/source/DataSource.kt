package com.example.tiendat.androidbaseproject.data.source

import com.example.tiendat.androidbaseproject.data.model.PojoObject

interface DataSource {
    interface RemoteDataSource {
        fun getDataFromRemote(): PojoObject
    }

    interface LocalDataSource {
        fun getDataFromLocal(): PojoObject
    }
}