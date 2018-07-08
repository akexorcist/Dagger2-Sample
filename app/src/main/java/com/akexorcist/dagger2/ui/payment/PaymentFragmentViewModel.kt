package com.akexorcist.dagger2.ui.payment

import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModel
import com.akexorcist.dagger2.util.NextzyAndroidUtil
import com.akexorcist.dagger2.util.NextzyUtil
import javax.inject.Inject

@VisibleForTesting
class PaymentFragmentViewModel @Inject constructor(private var util: NextzyUtil,
                                                   private var androidUtil: NextzyAndroidUtil) : ViewModel() {

    fun doSomething() {
        util.doSomething()
        Log.e("Check", "Yo, ${androidUtil.getAppName()}. It's me, Fragment!")
    }
}