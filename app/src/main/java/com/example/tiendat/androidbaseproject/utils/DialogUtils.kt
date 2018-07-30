package com.example.tiendat.androidbaseproject.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.example.tiendat.androidbaseproject.R

object DialogUtils {

    fun createLoadingDialog(context: Context?, cancelable: Boolean): Dialog = Dialog(context).apply {
        setCancelable(cancelable)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(R.layout.layout_loading_dialog)
    }

}
