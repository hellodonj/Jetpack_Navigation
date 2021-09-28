package com.example.jetpack_navigation.database

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by djj on 2021/09/07.
 */

@Dao
interface UserDao {
    @Query("SELECT * FROM user_database ORDER BY user_title DESC" )
    fun getUserList():LiveData<List<UserEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(userEntity: UserEntity)

    @Query("DELETE FROM user_database")
    suspend fun deleteUser()

    @Delete
    fun deleteUser01(userDao: UserDao)

    @Update
    fun updateUser(userDao: UserDao)
}