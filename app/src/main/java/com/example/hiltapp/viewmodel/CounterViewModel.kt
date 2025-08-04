package com.example.hiltapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.hiltapp.model.CounterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(
    private val model: CounterModel
) : ViewModel() {

    private val _counter = MutableStateFlow(0)
    val counter: StateFlow<Int> = _counter

    fun incrementCounter() {
        _counter.value = model.increment(_counter.value)
    }

    fun decrementCounter() {
        _counter.value = model.decrement(_counter.value)
    }
}
