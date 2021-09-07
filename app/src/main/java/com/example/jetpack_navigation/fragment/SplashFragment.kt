package com.example.jetpack_navigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.jetpack_navigation.R

/**
 * splashFragment
 */
class SplashFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_splash, container, false)
        var button3 = view.findViewById<Button>(R.id.button3)




        button3.setOnClickListener {

            ////1 利用id导航 传值

            //设置动画参数
            val navOptions = navOptions {
                anim {
                    enter = R.anim.fragment_open_enter
                    exit = R.anim.fragment_open_exit
                    popEnter = R.anim.fragment_close_enter
                    popExit = R.anim.fragment_close_exit
                }
            }

            //设置参数
            val bundle = Bundle()
            bundle.putInt("num",888)

            findNavController().navigate(R.id.action_splashFragment_to_loginFragment,bundle,navOptions)

            //findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }
        return view
    }

}