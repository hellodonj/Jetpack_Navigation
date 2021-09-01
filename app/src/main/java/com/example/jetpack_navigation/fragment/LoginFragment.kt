package com.example.jetpack_navigation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.jetpack_navigation.R

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle = arguments
        var num = bundle?.getInt("num")
        Log.i(TAG, "LoginFragment: " + num)

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //1 id跳转
           // findNavController().navigate(R.id.action_loginFragment_to_registerFragment)

            //2 args
            val action = LoginFragmentDirections
                .actionLoginFragmentToRegisterFragment()
                .setClassName("loginFragment")

            findNavController().navigate(action)
        }
    }

    companion object{
        private const val TAG = "LoginFragment"
    }

}
