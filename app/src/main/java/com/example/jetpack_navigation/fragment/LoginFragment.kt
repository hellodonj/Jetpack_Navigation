package com.example.jetpack_navigation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.fragment.findNavController
import com.example.jetpack_navigation.R
import com.example.jetpack_navigation.bean.UserBean
import com.example.jetpack_navigation.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    //1
    private var fragmentLoginBinding: FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //1
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

        fragmentLoginBinding = binding

        binding.textView.text = "登录界面"

        binding.button.setOnClickListener {

        }

        return binding.root

//        val bundle = arguments
//        var num = bundle?.getInt("num")
//        Log.i(TAG, "LoginFragment: " + num)
//        val loginBinding:FragmentLoginBinding =
//            DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
//
//        loginBinding.userBean = UserBean("我是登录界面","密码:654321")
//        return loginBinding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        var button = view.findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            //1 id跳转
//           // findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
//
//            //2 args
//            val action = LoginFragmentDirections
//                .actionLoginFragmentToRegisterFragment()
//                .setClassName("loginFragment")
//
//            findNavController().navigate(action)
//        }
//    }
//
//    companion object{
//        private const val TAG = "LoginFragment"
//    }

    override fun onDestroyView() {
        fragmentLoginBinding = null
        super.onDestroyView()
    }

}
