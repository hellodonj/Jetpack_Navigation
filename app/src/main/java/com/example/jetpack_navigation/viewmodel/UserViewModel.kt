package com.example.jetpack_navigation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jetpack_navigation.bean.Gender
import com.example.jetpack_navigation.bean.User


/**
 * Created by djj on 2021/09/06.
 */
class UserViewModel : ViewModel() {

    var userLiveData = MutableLiveData<User>()

    init {
        userLiveData.postValue(User("备注:XXX","djz",1, Gender.MALE))
    }

    fun doSomething() {
        var user = userLiveData.value
        if (user != null) {
            user.age = 30
            user.name = "djj"

            userLiveData.value = user
        }
    }
}