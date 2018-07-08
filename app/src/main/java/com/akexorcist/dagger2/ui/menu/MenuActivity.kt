package com.akexorcist.dagger2.ui.menu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.about.AboutActivity
import com.akexorcist.dagger2.ui.detail.DetailActivity
import com.akexorcist.dagger2.ui.feed.FeedActivity
import com.akexorcist.dagger2.ui.home.HomeActivity
import com.akexorcist.dagger2.ui.main.MainActivity
import com.akexorcist.dagger2.ui.payment.PaymentActivity
import com.akexorcist.dagger2.util.openActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        buttonPlainActivity.setOnClickListener {
            openActivity(MainActivity::class.java)
        }
        buttonActivityWithViewModel.setOnClickListener {
            openActivity(HomeActivity::class.java)
        }
        buttonActivityWithViewModelAndRepository.setOnClickListener {
            openActivity(FeedActivity::class.java)
        }
        buttonPlainActivityWithContextUtil.setOnClickListener {
            openActivity(AboutActivity::class.java)
        }
        buttonPlainActivityWithPlainFragment.setOnClickListener {
            openActivity(DetailActivity::class.java)
        }
        buttonActivityWithViewModelAndFragmentWithViewModel.setOnClickListener {
            openActivity(PaymentActivity::class.java)
        }
    }
}
