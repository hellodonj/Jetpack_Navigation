package com.example.jetpack_navigation.bean

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.jetpack_navigation.MainActivity

/**
 * Created by djj on 2021/09/02.
 */
class LoginModel constructor(name: String, password: String, context: Context) {

    val n = ObservableField<String>(name)
    val p = ObservableField<String>(password)

    var context: Context = context


    /**
     * 用户名修改
     */
    fun onNameChange(char: CharSequence) {
        n.set(char.toString())
    }

    /**
     * 密码修改
     */
    fun onPwdChange(char: CharSequence) {
        p.set(char.toString())
    }

    fun login(){
        if (n.get().equals("djj") && p.get().equals("123456")){
            val intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent)
            Toast.makeText(context,"账号密码正确",Toast.LENGTH_SHORT).show()
        }
    }
}