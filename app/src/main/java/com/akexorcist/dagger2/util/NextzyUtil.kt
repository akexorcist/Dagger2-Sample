package com.akexorcist.dagger2.util

import android.util.Log
import androidx.annotation.VisibleForTesting
import javax.inject.Inject
import javax.inject.Singleton

@VisibleForTesting
@Singleton
class NextzyUtil @Inject constructor() {
    fun doSomething() {
        Log.e("Check", "Do Something")
    }
}
