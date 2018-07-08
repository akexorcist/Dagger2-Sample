package com.akexorcist.dagger2.ui.home

import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModelProviders
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity

@VisibleForTesting
class HomeActivity : NextzyActivity() {
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(HomeViewModel::class.java)
        Log.e("Check", "App name is ${viewModel.showAppName()}")
    }
}
