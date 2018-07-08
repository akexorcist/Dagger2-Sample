package com.akexorcist.dagger2.util

import android.app.Activity
import android.content.Intent

inline fun <T : Activity> Activity.openActivity(cls: Class<T>) {
    startActivity(Intent(this, cls))
}