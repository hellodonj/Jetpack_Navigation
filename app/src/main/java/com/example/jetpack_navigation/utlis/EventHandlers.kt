package com.example.jetpack_navigation.utlis

import android.view.View

/**
 * Created by djj on 2021/09/06.
 */
class EventHandlers {

    fun onFirstClick(view:View){
        println("点击了第一个按钮")
    }

    fun onCopyTextView(text:String){
        println("复制的内容: $text")
    }
}