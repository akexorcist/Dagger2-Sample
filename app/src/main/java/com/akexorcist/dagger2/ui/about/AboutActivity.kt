package com.akexorcist.dagger2.ui.about

import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity
import com.akexorcist.dagger2.util.NextzyAndroidUtil
import javax.inject.Inject

@VisibleForTesting
class AboutActivity : NextzyActivity() {
    @Inject
    lateinit var androidUtil: NextzyAndroidUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        Log.e("Check", "App name is ${androidUtil.getAppName()}")
    }
}
