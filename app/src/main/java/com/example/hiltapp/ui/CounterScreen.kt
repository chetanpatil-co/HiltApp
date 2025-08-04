package com.example.hiltapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(counter: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Counter: $counter", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onIncrement) {
            Text("Increment")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onDecrement) {
            Text("Decrement")
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    CounterScreen(counter = 5, onIncrement = {})
}
*/

