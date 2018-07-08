package com.akexorcist.dagger2.ui.feed

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity

@VisibleForTesting
class FeedActivity : NextzyActivity() {
    private lateinit var viewModel: FeedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(FeedViewModel::class.java)
        viewModel.users.observe(this, Observer { users ->
            // Do something
        })
    }
}
