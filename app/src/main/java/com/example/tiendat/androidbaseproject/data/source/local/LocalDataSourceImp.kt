package com.example.tiendat.androidbaseproject.data.source.local

import com.example.tiendat.androidbaseproject.data.model.PojoObject
import com.example.tiendat.androidbaseproject.data.source.DataSource

class LocalDataSourceImp : DataSource.LocalDataSource {
    override fun getDataFromLocal(): PojoObject = PojoObject()
}