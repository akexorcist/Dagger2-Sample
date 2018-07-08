package com.akexorcist.dagger2.ui.home

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModel
import com.akexorcist.dagger2.util.NextzyAndroidUtil
import com.akexorcist.dagger2.util.NextzyUtil
import javax.inject.Inject

@VisibleForTesting
class HomeViewModel @Inject constructor(private val util: NextzyUtil,
                                        private val androidUtil: NextzyAndroidUtil) : ViewModel() {
    fun go() {
        util.doSomething()
    }

    fun showAppName() = androidUtil.getAppName()
}
