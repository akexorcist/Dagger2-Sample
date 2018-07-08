package com.akexorcist.dagger2.repository

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import com.akexorcist.dagger2.api.AwesomeService
import com.akexorcist.dagger2.db.AwesomeDao
import com.akexorcist.dagger2.db.AwesomeDb
import com.akexorcist.dagger2.repository.core.AppExecutors
import com.akexorcist.dagger2.repository.core.NetworkBoundResource
import com.akexorcist.dagger2.util.RateLimiter
import com.akexorcist.dagger2.vo.Resource
import com.akexorcist.dagger2.vo.User
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@VisibleForTesting
@Singleton
class FeedRepository @Inject constructor(private var appExecutors: AppExecutors,
                                         private var awesomeDb: AwesomeDb,
                                         private var awesomeDao: AwesomeDao,
                                         private var awesomeService: AwesomeService) {
    private val repoListRateLimit = RateLimiter<String>(10, TimeUnit.MINUTES)

    fun getUsers(owner: String): LiveData<Resource<List<User>>> {
        return object : NetworkBoundResource<List<User>, List<User>>(appExecutors) {
            override fun saveCallResult(item: List<User>) {
                awesomeDao.insertUsers(item)
            }

            override fun shouldFetch(data: List<User>?): Boolean {
                return data == null || data.isEmpty() || repoListRateLimit.shouldFetch(owner)
            }

            override fun loadFromDb() = awesomeDao.loadUsers(owner)

            override fun createCall() = awesomeService.getUser(owner)

            override fun onFetchFailed() {
                repoListRateLimit.reset(owner)
            }
        }.asLiveData()
    }
}
