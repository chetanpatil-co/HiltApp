package com.example.hiltapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import com.example.hiltapp.ui.CounterScreen
import com.example.hiltapp.viewmodel.CounterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel: CounterViewModel by viewModels()

        super.onCreate(savedInstanceState)
        setContent {
            val counter = viewModel.counter.collectAsState()
            CounterScreen(
                counter = counter.value,
                onIncrement = { viewModel.incrementCounter() },
                onDecrement = { viewModel.decrementCounter() }
            )
        }
    }
}
