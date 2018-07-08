/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.akexorcist.dagger2.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akexorcist.dagger2.di.ViewModelKey
import com.akexorcist.dagger2.ui.feed.FeedViewModel
import com.akexorcist.dagger2.ui.home.HomeViewModel
import com.akexorcist.dagger2.ui.payment.PaymentActivityViewModel
import com.akexorcist.dagger2.ui.payment.PaymentFragmentViewModel
import com.akexorcist.dagger2.viewmodel.AwesomeViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindUserViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FeedViewModel::class)
    abstract fun bindFeedViewModel(feedViewModel: FeedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PaymentActivityViewModel::class)
    abstract fun bindPaymentActivityViewModel(paymentActivityViewModel: PaymentActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PaymentFragmentViewModel::class)
    abstract fun bindPaymentFragmentViewModel(paymentFragmentViewModel: PaymentFragmentViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: AwesomeViewModelFactory): ViewModelProvider.Factory
}
