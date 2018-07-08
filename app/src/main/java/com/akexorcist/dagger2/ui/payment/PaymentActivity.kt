package com.akexorcist.dagger2.ui.payment

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModelProviders
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyActivity

@VisibleForTesting
class PaymentActivity : NextzyActivity() {

    private lateinit var viewModel: PaymentActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(PaymentActivityViewModel::class.java)
        viewModel.doSomething()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layoutFragmentContainer, PaymentFragment.newInstance())
        }.commit()
    }
}
