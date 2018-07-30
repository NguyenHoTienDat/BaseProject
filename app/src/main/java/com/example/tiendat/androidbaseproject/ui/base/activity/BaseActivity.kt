package com.example.tiendat.androidbaseproject.ui.base.activity

import android.arch.lifecycle.LifecycleOwner
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import com.example.tiendat.androidbaseproject.ui.base.viewmodel.BaseViewModel

abstract class BaseActivity<ViewBinding : ViewDataBinding, ViewModel : BaseViewModel>
    : AppCompatActivity(), LifecycleOwner {

    lateinit var binding: ViewBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutRes())
        binding.setLifecycleOwner(this@BaseActivity)
        initData(initViewModel())
        observeViewModel()
        setEvents()
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.releaseRes()
    }

    @LayoutRes
    abstract fun getLayoutRes(): Int

    abstract fun initData(initViewModel: Unit)

    abstract fun setEvents()

    abstract fun initViewModel()

    abstract fun observeViewModel()
}
