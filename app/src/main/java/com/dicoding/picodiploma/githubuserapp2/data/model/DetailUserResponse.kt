package com.dicoding.picodiploma.githubuserapp2.data.model

import com.google.gson.annotations.SerializedName

data class DetailUserResponse(
    val login :String,
    val id : Int,
    @SerializedName("avatar_url")
    val avatarUrl : String,
    @SerializedName("following_url")
    val followingUrl : String,
    val name : String,
    val following : Int,
    val followers : Int,
    val company :String,
    val location : String,
    val public_repos : String
)
