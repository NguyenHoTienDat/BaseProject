package com.example.tiendat.androidbaseproject.data.source.remote

import com.example.tiendat.androidbaseproject.data.model.PojoObject
import com.example.tiendat.androidbaseproject.data.source.DataSource

class RemoteDataSourceImp: DataSource.RemoteDataSource {
    override fun getDataFromRemote(): PojoObject = PojoObject()
}