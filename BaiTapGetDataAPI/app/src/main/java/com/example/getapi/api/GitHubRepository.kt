package com.example.getapi.api

import com.example.getapi.model.ListUserFollowers
import com.example.getapi.model.UserModel

interface GitHubRepository {
    suspend fun getUserDetailsFromApi(userName : String) : UserModel?

    suspend fun getListUserFollowers(userName : String) : ListUserFollowers?

}