package com.akexorcist.dagger2.util

import android.content.Context
import com.akexorcist.dagger2.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NextzyAndroidUtil @Inject constructor(private var context: Context) {
    fun getAppName(): String = context.getString(R.string.app_name)
}