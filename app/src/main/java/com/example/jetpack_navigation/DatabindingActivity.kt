package com.example.jetpack_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpack_navigation.bean.Gender
import com.example.jetpack_navigation.bean.User
import com.example.jetpack_navigation.databinding.ActivityDatabindingBinding

class DatabindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_databinding)

        val dataBinding: ActivityDatabindingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_databinding)

        dataBinding.user = User("", "djj", 18, Gender.FEMALE)

        dataBinding.textView5.setText("SEX:")
        //list集合
        dataBinding.userList = listOf("list1", "list2")
        //map集合
        dataBinding.scoreMap = hashMapOf("list1" to 88, "list2" to 99)
        //index
        dataBinding.index = 1

    }
}