package com.akexorcist.dagger2.ui.detail


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.VisibleForTesting
import com.akexorcist.dagger2.R
import com.akexorcist.dagger2.ui.core.NextzyFragment
import com.akexorcist.dagger2.util.NextzyAndroidUtil
import com.akexorcist.dagger2.util.NextzyUtil
import javax.inject.Inject

@VisibleForTesting
class DetailFragment : NextzyFragment() {
    @Inject
    lateinit var androidUtil: NextzyAndroidUtil

    @Inject
    lateinit var util: NextzyUtil

    companion object {
        @JvmStatic
        fun newInstance() = DetailFragment()
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
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Check", "App name is ${androidUtil.getAppName()}")
    }
}
