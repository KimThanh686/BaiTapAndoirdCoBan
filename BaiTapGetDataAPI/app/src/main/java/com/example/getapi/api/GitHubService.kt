package com.example.getapi.api

import com.example.getapi.model.ListUserFollowers
import com.example.getapi.model.UserModel
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("/users/{userName}")
    suspend fun getUserDetails(@Path("userName") userName: String?): UserModel?

    @GET("/users/{userName}/followers")
    suspend fun getListFollowers(@Path("userName") userName: String?): ListUserFollowers?
}