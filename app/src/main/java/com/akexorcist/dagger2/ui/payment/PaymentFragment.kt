package com.akexorcist.dagger2.ui.payment


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModelProviders
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyFragment

@VisibleForTesting
class PaymentFragment : NextzyFragment() {
    lateinit var viewModel: PaymentFragmentViewModel

    companion object {
        @JvmStatic
        fun newInstance() = PaymentFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Android Util cannot inject in this method
        // if you want to do something, call it after view created
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // Android Util cannot inject in this method
        // if you want to do something, call it after view created
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(PaymentFragmentViewModel::class.java)
        viewModel.doSomething()
    }
}
