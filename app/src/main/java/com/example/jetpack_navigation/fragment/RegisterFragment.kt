package com.example.jetpack_navigation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.jetpack_navigation.R

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_register, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val safeArgs: RegisterFragmentArgs by navArgs()
//        var className = safeArgs.className
//
//        Log.i(TAG, "RegisterFragment:" + className)
//
//        var button = view.findViewById<Button>(R.id.button2)
//        button.setOnClickListener {
//            findNavController().popBackStack()
//        }
//    }

    companion object {
        private const val TAG = "RegisterFragment"
    }
}