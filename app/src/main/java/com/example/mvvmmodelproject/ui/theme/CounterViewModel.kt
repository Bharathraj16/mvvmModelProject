package com.example.mvvmmodelproject.ui.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    // Initialize count with a mutable state of 0
    private val _count = mutableStateOf(0)
    val count: MutableState<Int> = _count

    fun increment() {
        count.value++
    }

    fun decrement() {
        count.value--
    }
}
