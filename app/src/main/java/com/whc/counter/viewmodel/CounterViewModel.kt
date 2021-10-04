package com.whc.counter.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private var currentValue = 0
    val currentCount: MutableLiveData<Int> = MutableLiveData(0)

    fun add(value: Int) {
        currentValue += value
        currentCount.postValue(currentValue)
    }

    fun minus(value: Int) {
        currentValue -= value
        currentCount.postValue(currentValue)
    }
}