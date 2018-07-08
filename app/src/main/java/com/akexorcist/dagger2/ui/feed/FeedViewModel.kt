package com.akexorcist.dagger2.ui.feed

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.akexorcist.dagger2.repository.FeedRepository
import com.akexorcist.dagger2.util.AbsentLiveData
import com.akexorcist.dagger2.vo.Resource
import com.akexorcist.dagger2.vo.User
import javax.inject.Inject

@VisibleForTesting
class FeedViewModel @Inject constructor(private var feedRepository: FeedRepository) : ViewModel() {

    private val owner = MutableLiveData<String>()

    val users: LiveData<Resource<List<User>>> = Transformations
            .switchMap(owner) { owner ->
                if (owner == null) {
                    AbsentLiveData.create()
                } else {
                    feedRepository.getUsers(owner)
                }
            }

    fun loadUsers() {
        owner.value = ""
    }
}