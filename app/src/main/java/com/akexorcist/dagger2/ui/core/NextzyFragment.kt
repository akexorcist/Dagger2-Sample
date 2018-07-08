package com.akexorcist.dagger2.ui.core

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.akexorcist.dagger2.di.Injectable
import javax.inject.Inject

abstract class NextzyFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
}