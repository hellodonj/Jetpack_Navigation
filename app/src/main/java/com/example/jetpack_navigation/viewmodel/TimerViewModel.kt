package com.example.jetpack_navigation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*


/**
 * Created by djj on 2021/09/14.
 */
class TimerViewModel : ViewModel() {

    private val TAG = this.javaClass.name
    private var timer: Timer? = null
    private var currentTime = 0
    var text = MutableLiveData<Int>(0)


    fun startTime() {
        if (timer == null) {
            currentTime = 0
            timer = Timer()

            val task: TimerTask = object :TimerTask(){
                override fun run() {
                    //
                    currentTime++
                    text.postValue(currentTime)
                }
            }

            timer!!.schedule(task,1000,1000)
        }
    }


    override fun onCleared() {
        super.onCleared()
        timer!!.cancel()
    }
}