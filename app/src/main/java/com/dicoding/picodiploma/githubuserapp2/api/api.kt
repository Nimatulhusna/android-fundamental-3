package com.dicoding.picodiploma.githubuserapp2.api

import com.dicoding.picodiploma.githubuserapp2.api.Info.GITHUB_TOKEN
import com.dicoding.picodiploma.githubuserapp2.data.model.DetailUserResponse
import com.dicoding.picodiploma.githubuserapp2.data.model.User
import com.dicoding.picodiploma.githubuserapp2.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: $GITHUB_TOKEN")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: $GITHUB_TOKEN")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: $GITHUB_TOKEN")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: $GITHUB_TOKEN")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}