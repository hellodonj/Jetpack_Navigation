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

        dataBinding.user = User("djj", 18, Gender.FEMALE)

        dataBinding.textView5.setText("SEX:")

    }
}