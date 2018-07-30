package com.example.tiendat.androidbaseproject.data.source.repository

import com.example.tiendat.androidbaseproject.data.model.PojoObject
import com.example.tiendat.androidbaseproject.data.source.DataSource

class AppRepository private constructor(private val remoteSource: DataSource.RemoteDataSource
                                        , private val localSource: DataSource.LocalDataSource)
    : DataSource.LocalDataSource, DataSource.RemoteDataSource {

    companion object {
        private var INSTANCE: AppRepository? = null
        @JvmStatic
        fun getInstance(remoteSource: DataSource.RemoteDataSource
                        , localSource: DataSource.LocalDataSource): AppRepository {
            if (INSTANCE == null) {
                INSTANCE = AppRepository(remoteSource, localSource)
            }
            return INSTANCE!!
        }
    }

    override fun getDataFromRemote(): PojoObject = remoteSource.getDataFromRemote()

    override fun getDataFromLocal(): PojoObject = localSource.getDataFromLocal()
}