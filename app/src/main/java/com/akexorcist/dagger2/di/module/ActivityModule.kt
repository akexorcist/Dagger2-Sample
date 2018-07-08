/*
 * Copyright (C) 2017 The Android Open Source Project
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


import com.akexorcist.dagger2.ui.about.AboutActivity
import com.akexorcist.dagger2.ui.detail.DetailActivity
import com.akexorcist.dagger2.ui.feed.FeedActivity
import com.akexorcist.dagger2.ui.home.HomeActivity
import com.akexorcist.dagger2.ui.main.MainActivity
import com.akexorcist.dagger2.ui.payment.PaymentActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeHomeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeFeedActivity(): FeedActivity

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeAboutActivity(): AboutActivity

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeDetailActivity(): DetailActivity

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributePaymentActivity(): PaymentActivity
}
