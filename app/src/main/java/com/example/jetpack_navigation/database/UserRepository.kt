package com.example.jetpack_navigation.database

import androidx.lifecycle.LiveData

/**
 * Created by djj on 2021/09/07.
 */
class UserRepository(private val userDao: UserDao) {

    val userList:LiveData<List<UserEntity>> = userDao.getUserList()

    suspend fun insertUser(userEntity: UserEntity){
        userDao.insertUser(userEntity)
    }

}