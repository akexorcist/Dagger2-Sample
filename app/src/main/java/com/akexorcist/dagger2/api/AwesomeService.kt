package com.akexorcist.dagger2.api

import androidx.lifecycle.LiveData
import com.akexorcist.dagger2.api.core.ApiResponse
import com.akexorcist.dagger2.vo.User
import retrofit2.http.GET
import retrofit2.http.Path

interface AwesomeService {
    @GET("users/{login}")
    fun getUser(@Path("login") login: String): LiveData<ApiResponse<List<User>>>
}