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

import android.app.Application
import androidx.room.Room
import com.akexorcist.dagger2.api.AwesomeService
import com.akexorcist.dagger2.api.core.LiveDataCallAdapterFactory
import com.akexorcist.dagger2.db.AwesomeDao
import com.akexorcist.dagger2.db.AwesomeDb
import com.akexorcist.dagger2.util.NextzyAndroidUtil
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module(includes = [ViewModelModule::class])
class AppModule {
    @Singleton
    @Provides
    fun provideGithubService(): AwesomeService {
        return Retrofit.Builder()
                .baseUrl("https://www.example.com/")
//            .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
                .create(AwesomeService::class.java)
    }

    @Singleton
    @Provides
    fun provideDb(app: Application): AwesomeDb {
        return Room
                .databaseBuilder(app, AwesomeDb::class.java, "github.db")
                .fallbackToDestructiveMigration()
//                .openHelperFactory {
//                    SafeHelperFactory.fromUser("Akexorcist")
//                }
                .build()
    }

    @Singleton
    @Provides
    fun provideUserDao(db: AwesomeDb): AwesomeDao {
        return db.awesomeDao()
    }

    @Singleton
    @Provides
    fun provideNextzyAndroidUtil(app: Application) = NextzyAndroidUtil(app.baseContext)
}
