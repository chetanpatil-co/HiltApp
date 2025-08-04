package com.example.hiltapp.model

class CounterModel {
    fun increment(count: Int): Int = count + 1

    fun decrement(count: Int): Int = count - 1
}