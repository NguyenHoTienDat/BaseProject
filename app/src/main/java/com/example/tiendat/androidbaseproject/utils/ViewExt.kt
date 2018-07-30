package com.example.tiendat.androidbaseproject.utils

import android.support.design.widget.Snackbar
import android.view.View

/**
 * Transforms static java function Snackbar.make() to an extension function on View.
 */
fun View.showSnackbar(snackbarText: String, timeLength: Int) {
    Snackbar.make(this, snackbarText, timeLength).show()
}
