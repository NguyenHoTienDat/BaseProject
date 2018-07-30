package com.example.tiendat.androidbaseproject.ui.screen.main

import android.content.Context
import android.content.Intent
import com.example.tiendat.androidbaseproject.R
import com.example.tiendat.androidbaseproject.databinding.ActivityMainBinding
import com.example.tiendat.androidbaseproject.ui.base.activity.BaseActivity
import com.example.tiendat.androidbaseproject.ui.screen.details.DetailsActivity
import com.example.tiendat.androidbaseproject.utils.obtainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    companion object {
        fun getMainIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun initData(initViewModel: Unit) {

    }

    override fun initViewModel() {
        viewModel = this@MainActivity.obtainViewModel(MainViewModel::class.java)
                .apply {
                    this@MainActivity.lifecycle.addObserver(this)
                }
        binding.viewModel = viewModel
    }

    override fun setEvents() {
        button_navigation.setOnClickListener {
            startActivity(DetailsActivity.getDetailIntent(this))}
    }

    override fun observeViewModel() {

    }

    override fun getLayoutRes() = R.layout.activity_main
}
