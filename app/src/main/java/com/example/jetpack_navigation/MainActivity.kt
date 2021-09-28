package com.example.jetpack_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import com.example.jetpack_navigation.viewmodel.UserViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import java.util.List.of

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)


        //ViewModelProviders.of()过时
        //val userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        val userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

//        userViewModel.userLiveData.observe(this, Observer {
//            binding.text = userViewModel.toString()
//        })
//
//        binding.button.setOnClickListener{
//            userViewModel.doSomething()
//        }


//        coroutineScope.launch(Dispatchers.Main) { //主线程开启协程
//
//        }
//
//        coroutineScope.launch(Dispatchers.Main) {       // 开始协程：主线程
//            val token = api.getToken()                  // 网络请求：IO 线程
//            val user = api.getUser(token)               // 网络请求：IO 线程
//            nameTv.text = user.name                     // 更新 UI：主线程
//        }

    }

    override fun onSupportNavigateUp(): Boolean {
        var fragment = supportFragmentManager.findFragmentById(R.id.fragment)
        return NavHostFragment.findNavController(fragment!!).navigateUp()
    }
}