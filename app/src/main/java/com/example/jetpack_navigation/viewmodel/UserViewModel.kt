package com.example.jetpack_navigation.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jetpack_navigation.bean.Gender
import com.example.jetpack_navigation.bean.User


/**
 * Created by djj on 2021/09/06.
 */
class UserViewModel : ViewModel() {

    var userLiveData = MutableLiveData<User>()
    var age = ObservableField<Int>(1)
    var user = MutableLiveData<User>(User("", "djz", 1, Gender.MALE))

    init {
        userLiveData.postValue(User("备注:XXX", "djz", 1, Gender.MALE))
    }

    fun doSomething() {
        var user = userLiveData.value
        if (user != null) {
            user.age = 30
            user.name = "djj"

            userLiveData.value = user
        }
    }

    /**
     * 由于屏幕旋转导致的Activity重建，该方法不会被调用
     * 只有ViewModel已经没有任何Activity与之有关联，系统则会调用该方法，你可以在此清理资源
     */
    override fun onCleared() {
        super.onCleared()
        //
    }
}