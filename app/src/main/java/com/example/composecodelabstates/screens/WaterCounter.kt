package com.example.composecodelabstates.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composecodelabstates.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }

        if(count > 0){
            Text(stringResource(R.string.glasses_counter_label, count))
        }
        Button(
            onClick = { count++  },
            modifier = Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text(stringResource(R.string.add_one_button_label))
        }
    }

}