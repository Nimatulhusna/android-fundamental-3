package com.dicoding.picodiploma.githubuserapp2.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.dicoding.picodiploma.githubuserapp2.data.local.FavoriteUser
import com.dicoding.picodiploma.githubuserapp2.data.local.FavoriteUserDao
import com.dicoding.picodiploma.githubuserapp2.data.local.UserRoomDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private var userDao: FavoriteUserDao?
    private var userDb: UserRoomDatabase?

    init {
        userDb = UserRoomDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}