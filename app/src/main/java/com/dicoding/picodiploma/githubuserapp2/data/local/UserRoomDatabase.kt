package com.dicoding.picodiploma.githubuserapp2.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [FavoriteUser::class],
    version = 1
)
abstract class UserRoomDatabase: RoomDatabase() {
    companion object {
        var INSTANCE : UserRoomDatabase? = null

        fun getDatabase(context: Context): UserRoomDatabase?{
            if(INSTANCE == null){
                synchronized(UserRoomDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, UserRoomDatabase::class.java, "user database").build()
                }
            }
            return INSTANCE
        }
    }

    abstract fun favoriteUserDao(): FavoriteUserDao
}