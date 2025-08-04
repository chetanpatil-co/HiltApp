package com.example.hiltapp

import com.example.hiltapp.model.CounterModel
import com.example.hiltapp.viewmodel.CounterViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CounterViewModelTest {

    private lateinit var viewModel: CounterViewModel

    @Before
    fun setup() {
        viewModel = CounterViewModel(CounterModel())
    }

    @Test
    fun `initial value is 0`() = runTest {
        val value = viewModel.counter.first()
        assertEquals(0, value)
    }

    @Test
    fun `increment increases value by 1`() = runTest {
        viewModel.incrementCounter()
        val value = viewModel.counter.first()
        assertEquals(1, value)
    }
}
