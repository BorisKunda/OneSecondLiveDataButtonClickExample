package com.boriskunda.ld_exercise

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class VM : ViewModel() {

    private val btnClickedSld:SingleLiveEvent<Boolean> = SingleLiveEvent()
    val btnClickedLd:LiveData<Boolean> = btnClickedSld

    fun clickButton() {
    btnClickedSld.call()
    }

}