package com.example.jetpack_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)

    }

    override fun onSupportNavigateUp(): Boolean {
        var fragment = supportFragmentManager.findFragmentById(R.id.fragment)
        return NavHostFragment.findNavController(fragment!!).navigateUp()
    }
}