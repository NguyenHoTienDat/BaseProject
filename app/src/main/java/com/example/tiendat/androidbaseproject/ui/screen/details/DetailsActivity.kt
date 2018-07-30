package com.example.tiendat.androidbaseproject.ui.screen.details

import android.app.Dialog
import android.content.Context
import android.content.Intent
import com.example.tiendat.androidbaseproject.R
import com.example.tiendat.androidbaseproject.databinding.ActivityDetailsBinding
import com.example.tiendat.androidbaseproject.ui.base.activity.BaseLoadActivity
import com.example.tiendat.androidbaseproject.utils.DialogUtils
import com.example.tiendat.androidbaseproject.utils.obtainViewModel

class DetailsActivity: BaseLoadActivity<ActivityDetailsBinding, DetailViewModel>() {

    companion object {
        fun getDetailIntent(context: Context) = Intent(context, DetailsActivity::class.java)
    }

    override fun getLayoutRes() = R.layout.activity_details

    override fun initData(initViewModel: Unit) {
        Dialog(this).setContentView(R.layout.layout_loading_dialog).show()
    }

    override fun initViewModel() {
        viewModel = this@DetailsActivity.obtainViewModel(DetailViewModel::class.java)
                .apply {
                    this@DetailsActivity.lifecycle.addObserver(this)
                }
        binding.viewModel = viewModel
    }

    override fun setEvents() {

    }

    override fun observeViewModel() {

    }
}