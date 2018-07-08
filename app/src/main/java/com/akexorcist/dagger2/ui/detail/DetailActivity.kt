package com.akexorcist.dagger2.ui.detail

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity

@VisibleForTesting
class DetailActivity : NextzyActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layoutFragmentContainer, DetailFragment.newInstance())
        }.commit()
    }
}
