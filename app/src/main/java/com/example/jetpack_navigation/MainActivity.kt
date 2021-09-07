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

    }

    override fun onSupportNavigateUp(): Boolean {
        var fragment = supportFragmentManager.findFragmentById(R.id.fragment)
        return NavHostFragment.findNavController(fragment!!).navigateUp()
    }
}