package com.akexorcist.dagger2.ui.main

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity

@VisibleForTesting
class MainActivity : NextzyActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


