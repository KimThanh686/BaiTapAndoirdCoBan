package com.example.getapi.api

import com.example.getapi.model.ListUserFollowers
import com.example.getapi.model.UserModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class GitHunDataRepository : GitHubRepository {
    private var gitHubService : GitHubService? = null
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        gitHubService = retrofit.create(GitHubService::class.java)
    }

    override suspend fun getUserDetailsFromApi(userName: String): UserModel? {
        return gitHubService?.getUserDetails(userName = userName)
    }

    override suspend fun getListUserFollowers(userName: String): ListUserFollowers? {
        return gitHubService?.getListFollowers(userName = userName)
    }
}