package com.example.tiendat.androidbaseproject.ui.base.activity

import android.app.Dialog
import android.arch.lifecycle.Observer
import android.databinding.ViewDataBinding
import com.example.tiendat.androidbaseproject.ui.base.viewmodel.BaseLoadViewModel
import com.example.tiendat.androidbaseproject.utils.DialogUtils

abstract class BaseLoadActivity<ViewBinding : ViewDataBinding, ViewModel : BaseLoadViewModel>
    : BaseActivity<ViewBinding, ViewModel>() {

    lateinit var loadingDialog: Dialog

    override fun initData(initViewModel: Unit) {
        loadingDialog = DialogUtils.createLoadingDialog(this, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.isDataLoading.removeObservers(this@BaseLoadActivity)
    }

    override fun observeViewModel() {
        viewModel.isDataLoading.observe(this, Observer {
            it?.let { handleLoadingChanged(it) }
        })
    }

    open fun handleLoadingChanged(isLoading: Boolean) {
        if (isLoading) showLoadingDialog() else hideLoadingDialog()
    }

    fun showLoadingDialog() {
        if (isFinishing) return
        loadingDialog.show()
    }

    fun hideLoadingDialog() {
        if (isFinishing) return
        loadingDialog.dismiss()
    }
}
